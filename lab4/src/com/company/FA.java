package com.company;

import javafx.util.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FA {
    private String initState;
    private List<String> finalStates;
    private List<String> alphabet;
    private List<String> states;
    private Map<Pair<String, String>, String> transitions;

    public FA()
    {
        this.finalStates = new ArrayList<>();
        this.alphabet = new ArrayList<>();
        this.states = new ArrayList<>();
        this.transitions = new HashMap<>();
    }

    public void readFromFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\Dan_B\\Documents\\FLC\\lab4\\src\\com\\company\\FA.in");
        Scanner scanner = new Scanner(file);

        states = Arrays.asList(scanner.nextLine().split(" "));
        alphabet = Arrays.asList(scanner.nextLine().split(" "));
        initState = scanner.nextLine();
        finalStates = Arrays.asList(scanner.nextLine().split(" "));

        while(scanner.hasNext())
        {
            String[] aux = scanner.nextLine().split(" ");
            transitions.put(new Pair<>(aux[0], aux[1]), aux[2]);
        }
    }

    public String printStates()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object state: this.states)
        {
            stringBuilder.append(state);
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public String printAlphabet()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object a: this.alphabet)
        {
            stringBuilder.append(a);
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public String printInitState()
    {
        return this.initState;
    }

    public String printFinalStates()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object state: this.finalStates)
        {
            stringBuilder.append(state);
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public String printTransitions()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object key: this.transitions.keySet())
        {
            stringBuilder.append(key).append(" ").append(transitions.get(key));
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}
