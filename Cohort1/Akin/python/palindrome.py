import string

original_str = input("Input a string:")
modified_str = original_str.lower()

bad_chars = string.whitespace + string.punctuation

for char in modified_str:
    if char in bad_chars:
        modified_str = modified_str.replace(char,'')

#print(modified_str)
if modified_str == modified_str[::-1]:
    print()
