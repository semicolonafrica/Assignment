data_file = open("dictionary.txt", "r")


def clean_word(word):
    return word.strip().lower

def get_vowels_in_word(word):
    