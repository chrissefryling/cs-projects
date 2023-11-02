#!/usr/bin/ruby	
# Coder: Christine Fryling
# Reviewer: Ken Wu

def catalan(i)
  def binomial(b,k)
    def factorial(num)
      if num == 0
        1
      else
        if num > 0
          num*factorial(num-1)
        end
      end
    end
    factorial(b)/(factorial(k)*factorial(b-k))
  end
  binomial(2*i,i)/(i+1)
end

for i in 0..9
  puts catalan(i)
end


 








