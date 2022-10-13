def is_palindrome(string):
    return (string==string[::-1])

print("abcba is a palindrome : ", is_palindrome("abcba"))
print("aabccba is a palindrome : ", is_palindrome("abccba"))
print("abcbbaz is a palindrome : ", is_palindrome("abcbbaz"))
