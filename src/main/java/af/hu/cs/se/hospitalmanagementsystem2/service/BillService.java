package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Bill;

public interface BillService {
    void saveBill(Bill bill);

    Object findAll();
    Bill findBillById(Long id);

    void deleteBillById(Long id);
}
