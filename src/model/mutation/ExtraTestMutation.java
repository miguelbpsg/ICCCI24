package model.mutation;

import java.util.List;

import model.chromosome.Chromosome;
import model.chromosome.FSMTest;

public class ExtraTestMutation extends Mutation{

	public ExtraTestMutation(double prob, List<FSMTest> tests) {
		this.prob = prob;
		this.mutacion = 1;
		this.tests = tests;
		this.text = "Ad_";

	}
	
	public ExtraTestMutation() {
		this.mutacion = 1;
		this.text = "Ad_";
	}
	
	public Chromosome[] mutate(Chromosome[] pob) {
		for(int i = 0; i < pob.length; i++)
			if(rnd.nextDouble() <= prob || !pob[i].isModified()) {
				FSMTest t = new FSMTest(tests.get(rnd.nextInt(tests.size())));
				pob[i].setGene(pob[i].getGenotype().size(), t);
			}
		return pob;
	}
	
	@Override
	public String toString() {
		return "Extra test mutation";
	}
}
