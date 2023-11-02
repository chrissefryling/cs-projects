num_one = 1.000
num_99 = 99.000

puts num_one + num_99

A_CONSTANT = 3
B_CONSTANT = 0

puts A_CONSTANT

x = 1

loop do
  x+= 1 
  
  
  next unless (x%2 == 0)
  puts x
  
  break if x >= 10
end


class Animal
  def initalize
    puts "creating a new animal"
  end
  def set_name(new_name)
    @name = new_name
  end
  def get_name
    @name
  end
end

cat = Animal.new
cat.set_name("kitty")

puts cat.get_name()



