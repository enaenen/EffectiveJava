package test;

import java.math.BigInteger;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Random;
import java.util.ServiceLoader;

public class PrimeGenerator {

	public static void main(String[] args) {
		String result = BigInteger.probablePrime(4, new Random()).toString();
		System.out.println(result);
//		BigInteger
//		ServiceLoader.load()
	}
}
