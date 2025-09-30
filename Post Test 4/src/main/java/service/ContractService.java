package service;

import java.util.ArrayList;
import model.Contract;

public class ContractService {
    private ArrayList<Contract> contracts = new ArrayList<>();

    public void addContract(Contract contract) {
        contracts.add(contract);
        System.out.println("Contract added successfully!");
    }

    public void viewContracts() {
        if (contracts.isEmpty()) {
            System.out.println("No contracts available.");
        } else {
            for (Contract c : contracts) {
                c.displayContract();
            }
        }
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }
}
