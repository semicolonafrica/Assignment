def get_digit(number, position):
    '''return digit at position in number, counting from position'''
    return (number // (10 ** position)) % 10

print(get_digit(12345,4))
