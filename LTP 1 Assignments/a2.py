def get_length(dna):
    """ (str) -> int

    Return the length of the DNA sequence dna.

    >>> get_length('ATCGAT')
    6
    >>> get_length('ATCG')
    4
    """
    return len(dna)

def is_longer(dna1, dna2):
    """ (str, str) -> bool

    Return True if and only if DNA sequence dna1 is longer than DNA sequence
    dna2.

    >>> is_longer('ATCG', 'AT')
    True
    >>> is_longer('ATCG', 'ATCGGA')
    False
    """
    return len(dna1) > len(dna2)

def count_nucleotides(dna, nucleotide):
    """ (str, str) -> int

    Return the number of occurrences of nucleotide in the DNA sequence dna.

    >>> count_nucleotides('ATCGGC', 'G')
    2
    >>> count_nucleotides('ATCTA', 'G')
    0
    """
    return dna.count(nucleotide)

def contains_sequence(dna1, dna2):
    """ (str, str) -> bool

    Return True if and only if DNA sequence dna2 occurs in the DNA sequence
    dna1.

    >>> contains_sequence('ATCGGC', 'GG')
    True
    >>> contains_sequence('ATCGGC', 'GT')
    False

    """
    return (dna1.find(dna2) >=0)

def is_valid_sequence(dna):

    is_valid = True

    for char in dna:
        if char not in 'ATGC':
            is_valid = False
    return is_valid

def insert_sequence(dna1, dna2, index):
    dna3 = dna1[:index] +dna2 + dna1[index:]
    return dna3

def get_complement(nucleo_T):
    if nucleo_T == 'A':
        return 'T'
    elif nucleo_T == 'T':
        return 'A'
    elif nucleo_T == 'G':
        return 'C'
    elif nucleo_T == 'C':
        return 'G'

def get_complementary_sequence(dna):
    comp_dna = ''

    for char in dna:
        comp_dna = comp_dna + get_complement(char)

    return comp_dna

def mystery(s):
	i = 0
	result = ''
	while s[i].isdigit():
		result = result + s[i]
		i = i+1
	return result


def shift(L):
    first = L[0]
    for i in range(1, len(L)):
        L[i-1] = L[i]
    L[-1] = first
        
