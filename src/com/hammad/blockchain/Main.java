package com.hammad.blockchain;

public class Main {
	public static void main(String[] args) {
		Blockchain chain = new Blockchain(3);
		chain.addBlock(chain.newBlock("Created By Hammad 1"));
		chain.addBlock(chain.newBlock("Created By Hammad 2"));
		chain.addBlock(chain.newBlock("Created By Hammad 3"));
		chain.addBlock(chain.newBlock("Created By Hammad 4"));
		chain.addBlock(chain.newBlock("Created By Hammad 5"));
		
		System.out.println("This Blockchain is valid : "+chain.isBlockChainValid());
		System.out.println(chain);
		
	}
}
