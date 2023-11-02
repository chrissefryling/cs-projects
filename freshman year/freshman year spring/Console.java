package core;

import adt.Response;
import adt.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * This class implements an interactive console for a database server.
 * 
 * Finish implementing the required features but do not modify the protocols.
 */
public class Console {
	/**
	 * This is the entry point for running the console as a stand-alone program.
	 */
	public static void main(String[] args) {
		prompt(new Server(), System.in, System.out);
	}

	public static void prompt(Server server, InputStream in_stream, OutputStream out_stream) {

		final Scanner in = new Scanner(in_stream);
		final PrintStream out = new PrintStream(out_stream);

		/*
		 * TODO: Use a REPL to prompt the user for inputs, and send each input to the
		 * server for parsing. No inputs are to be parsed in the console, except for the
		 * case-insensitive sentinel EXIT, which terminates the console.
		 */

		String text = "";
		while (!text.equals("exit")) {
			out.print(">> ");
			text = in.nextLine();

			List<Response> responses = server.interpret(text);

			/*
			 * TODO: This wrongly assumes that there is only one response from the server.
			 * However, there may be one or more responses, and each response should be
			 * reported in the order listed.
			 */
			for (int i = 0; i < responses.size(); i++) {
				out.println("Success: " + responses.get(i).get("success"));
				out.println("Message: " + responses.get(i).get("message"));
				out.println("Table:   " + responses.get(i).get("table"));
				Table table = (Table) responses.get(i).get("table");
				print(table);
			}
		}
	}

	public static void print(Table table) {
		String table_name = "";
		ArrayList<String> colNames = new ArrayList<String>();
		ArrayList<String> colTypes = new ArrayList<String>();
		String[] values;
		table_name = (String) table.getSchema().get("table_name");
		colNames = (ArrayList<String>) table.getSchema().get("column_names");
		colTypes = (ArrayList<String>) table.getSchema().get("column_types");
		values = table.toString().replaceAll("\\{|\\s", "").split("\\}+");

		if (table_name == null || table_name == "null") {
			System.out.println(table_name = " ");
		} else
			System.out.println(String.format("%-4s", "/" + table_name + "\\"));

		System.out.println("+--------------------------+");
		System.out.print("|");
		for (int z = 0; z < colNames.size(); z++) {
			// System.out.print("|");
			if (colNames.get(z).equals(table.getSchema().get("primary_column_name"))) {
				// System.out.print(" " + colNames.get(z) + "*" + " | ");
				if (colNames.get(z).length() > 6) {
					System.out.print(String.format("%-8s|", colNames.get(z).substring(0, 4) + "*"));
				} else
					System.out.print(String.format("%-8s|", colNames.get(z) + "*"));
			} else {
				if (colNames.get(z).length() > 6) {
					System.out.print(String.format("%-8s|", colNames.get(z).substring(0, 4) + ".."));
				} else
					System.out.print(String.format("%-8s|", colNames.get(z)));
			}
		}
		System.out.println("\n|==========================|");
		for (int j = 0; j < values.length; j++) {
			String[] location = new String[colNames.size()];
			String[] r = values[j].split(",");
			for (int m = 0; m < r.length; m++) {
				String[] arr = r[m].split("=");
				if (arr.length == 3) {
					if (colTypes.get(colNames.indexOf(arr[1])).equalsIgnoreCase("string")) {
						location[colNames.indexOf(arr[1])] = "'" + arr[2] + "'";
					} else
						location[colNames.indexOf(arr[1])] = arr[2];
				} else if (arr.length == 2) {
					if (colTypes.get(colNames.indexOf(arr[0])).equalsIgnoreCase("string")) {
						location[colNames.indexOf(arr[0])] = "\"" + arr[1] + "\"";
					} else
						location[colNames.indexOf(arr[0])] = arr[1];
				}
			}
			System.out.print("|");
			for (int l = 0; l < location.length; l++) {
				if (location[l] == null || location[l] == "null") {
					System.out.print(String.format("%-8s|", ""));
					// System.out.print(" " + " " + " |");
				} else if (location[l].length() > 6) {
					System.out.print(String.format("%-8s|", location[l].substring(0, 4) + "...\""));
				} else
					System.out.print(String.format("%-8s|", location[l]));
			}
			System.out.println("");
		}
		System.out.println("+--------------------------+");
	}
}
