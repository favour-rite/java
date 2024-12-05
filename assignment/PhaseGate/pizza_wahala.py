import string
guests = int(input("Enter number of guests that will attend the birthday party: "))
pizza = (input("sapa size, small money, big boys, odogwu "))


price_per_box = 0
number_of_slices = 0
if pizza == "sapa size":
	number_of_slices = 4
	price_per_box = 2000

elif pizza == "small money":
	number_of_slices = 6
	price_per_box = 2400

elif pizza == "big boys":
	number_of_slices = 8
	price_per_box = 3000

elif pizza == "odogwu":
	number_of_slices = 12
	price_per_box = 4200

boxes_of_pizza = (guests / number_of_slices)+1;

total_slice = boxes_of_pizza * number_of_slices;
left_over = total_slice - guests;
total_price = price_per_box * boxes_of_pizza;

print("Number of pizza to buy: " , boxes_of_pizza , " boxes")
print("Number of left_over: " , left_over , " slices")
print("Price: " , total_price)