package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    public ContractService() {

    }

    public void processContract(Contract contract, Integer months, OnlinePaymentService paymentService) {
        Double contractNetValue;
        LocalDate dueDate;
        Installment installment;

        for (int i = 1; i <= months; i++) {
            contractNetValue = contract.getTotalValue() / months + paymentService.paymentFee(contract.getTotalValue() / months) + paymentService.interest(contract.getTotalValue() / months, i);
            dueDate = contract.getDate().plusMonths(i);

            installment = new Installment(dueDate, contractNetValue);

            contract.addInstallment(installment);
        }
    }
}
