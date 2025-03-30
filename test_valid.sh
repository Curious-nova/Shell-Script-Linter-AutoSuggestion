#!/bin/bash
# A simple valid shell script for testing

# Variable assignment
name="John"
age=30

# Echo command
echo "Hello, $name!"

# If statement
if [ "$age" -gt 18 ]; then
    echo "You are an adult."
else
    echo "You are a minor."
fi

# For loop
for i in 1 2 3 4 5; do
    echo "Number: $i"
done

# While loop
counter=0
while [ $counter -lt 5 ]; do
    echo "Counter: $counter"
    counter=$((counter + 1))
done

# Command with pipe
ls -la | grep "\.sh$"

# Redirections
echo "This goes to a file" > output.txt
echo "This appends to a file" >> output.txt
cat non_existent_file 2> error.log

# Function definition
function say_hello() {
    local user="$1"
    echo "Hello, $user!"
}

# Function call
say_hello "$name"

# Case statement
fruit="apple"
case $fruit in
    "apple")
        echo "This is an apple."
        ;;
    "banana")
        echo "This is a banana."
        ;;
    *)
        echo "Unknown fruit."
        ;;
esac

# Arithmetic operation
result=$((5 + 3))
echo "5 + 3 = $result"

# Using source to load another script
# source ./another_script.sh

# Exit with success
exit 0
