#!/bin/bash

# A script with various errors for testing

# Missing quote
echo "Hello, world

# Incorrect variable assignment
name = "John"

# Missing 'then' keyword
if [ $age -gt 18 ]
    echo "You are an adult."
fi

# Unmatched bracket
if [ $value > 10 ]; then
    echo "Value is greater than 10."
fi

# Missing 'do' keyword
for i in 1 2 3 4 5
    echo "Number: $i"
done

# Unmatched 'done'
while [ $counter -lt 5 ]; do
    echo "Counter: $counter"
    counter=$((counter + 1))

# Incorrect pipe (missing command after pipe)
ls -la |

# Incorrect redirection (missing file)
echo "This goes to a file" >

# Incorrect command
ecoh "This is misspelled"

# Missing semicolon
if [ "$name" = "John" ] then
    echo "Hello John!"
fi

# Unbalanced quotes
echo "This is an unbalanced quote

# Subshell with missing closing parenthesis
$(echo "This is in a subshell"

# Exit with success
exit 0