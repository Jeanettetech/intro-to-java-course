package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {// readable sequence fo char values
	private String word;

	public ReverseCharSequence(String word) {
		this.word = word;

	}

	@Override
	public char charAt(int index) {// reverses at each index
		return word.charAt(length() - 1 - index);
	}

	@Override
	public int length() {
		return word.length();

	}

	@Override
	public CharSequence subSequence(int start, int end) {
		StringBuilder reversedSubsequence = new StringBuilder();// creating sn instance of string builder(mutable class
																// in java used for creating and manipulating strings as
																// strings are immutable)
		for (int i = end; i >= start; i--) {
			reversedSubsequence.append(word.charAt(i));
		}

		return reversedSubsequence.toString();
	}

	@Override
	public String toString() {
		return new StringBuilder(word).reverse().toString();
	}

}
