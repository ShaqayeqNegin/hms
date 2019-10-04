package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BillRepository;





@Service
public class BillServiceImpl  implements BillService{
    @Autowired
    private BillRepository billRepository;
    @Override
    public void saveBill(Bill bill) {

        billRepository.save(bill);
    }

    @Override
    public Object findAll() {
        return billRepository.findAll();
    }
    @Override
    public Bill findBillById(Long id) {
        return billRepository.getOne(id);
    }

    @Override
    public void deleteBillById(Long id) {
        billRepository.deleteById(id);
    }
}
