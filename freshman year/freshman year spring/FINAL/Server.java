package core;

import driver.*;	
import adt.Response;
import adt.Database;

import java.util.List;
import java.util.LinkedList;

/**
 * This class implements a server with an active connection to a backing
 * database.
 * 
 * Finish implementing the required features but do not modify the protocols.
 */
public class Server {
	private Database database;
	private List<Driver> drivers;

	public Server() {
		this(new Database());
	}

	public Server(Database database) {
		this.database = database;
		// TODO: Add each new driver as it is implemented.
		drivers = new LinkedList<Driver>();
		drivers.add(new DDropTable());
		drivers.add(new DShowTable());
		drivers.add(new DCreateTable());
		drivers.add(new DDumpTable());
		drivers.add(new DInsertInto());
		drivers.add(new DSelect());
		drivers.add(new DImport());
		drivers.add(new DExport());
	}

	public Database database() {
		return database;
	}

	public List<Response> interpret(String script) {
		/*
		 * TODO: This wrongly assumes the entire script is a single query. However,
		 * there may be one or more semicolon-delimited queries in the script to be
		 * split and parsed distinctly.
		 */
		List<String> queries = new LinkedList<String>();
		script.trim();
		String[] qu = script.split("\\s*;\\s*");
		for (int i = 0; i < qu.length; i++) {
			queries.add(qu[i]);
		}
		// queries.add(script);

		/*
		 * TODO: This only checks the first driver for a response to the first query.
		 * Instead, iterate over all drivers until one of them gives a response for the
		 * first query. Default to a failure response only if no driver gave a response
		 * for a query. Then iterate again for the next query.
		 */
		List<Response> responses = new LinkedList<Response>();
		for (int j = 0; j < queries.size(); j++) { 
			
			Response response = null;
			
			for (int i = 0; i < drivers.size(); i++) {
				//response = null;
				response = drivers.get(i).execute(database, queries.get(j));

				if (response != null) {
					responses.add(response);
					//System.out.println("2");
					break;
				}
			}
			
			if(response == null)
			{
				responses.add(new Response(false, "unknown query", null));
			}
			
		}

		return responses;
	}
}
