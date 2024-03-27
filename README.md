## An evolutive algorithm and a clustering technique to select good subsets of test for FSMs

This repository contains code related to the problem of obtaining a good subset of tests for FSMs.

In the folder "files", the different specifications "Spec_i.txt", each with a set of tests "Tests_i.txt"and mutants "Muts_i.txt", and the identifier of the mutant that each test kills "Elems_i.txt". Additionally, the file "Clustering_FSM.ipynb" contains the code for the clustering technique used.

The folder "src" contains the whole source code of the java project used to obtain solutions with GAs as described in the full paper.

The folder "Experiments" contains the row solutions of both the GAs and clustering techniques.

Finally, in the folder "Results", the experiments are analysed and depicted in graphs in files "Experiment_i".