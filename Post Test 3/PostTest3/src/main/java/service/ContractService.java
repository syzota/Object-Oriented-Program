/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Asus GK
 */

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
            System.out.println("No contracts found.");
        } else {
            for (Contract contract : contracts) {
                contract.displayContract();
            }
        }
    }

    public ArrayList<Contract> getAllContracts() {
        return contracts;
    }
}

