import random

# Generate ID from 1 to 1,000,000 with random values between 1 and 99
data = [(i, random.randint(1, 99)) for i in range(1, 1000001)]

# Format as required: "id;value"
formatted_data = "\n".join(f"id{id};{value}" for id, value in data)

# Save to a file or print
with open("output.txt", "w") as file:
    file.write(formatted_data)

print("Data generation complete. Saved to output.txt")