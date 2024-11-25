import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /** Import a list of customers. */
    public void readCustomerList(InputStream inputStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            Customer currentCustomer = null;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts[0].charAt(0) < '0' || parts[0].charAt(0) > '9') {
                    int lastSpaceIndex = line.lastIndexOf(" ");
                    String fullName = line.substring(0, lastSpaceIndex);
                    long idNumber = Long.parseLong(line.substring(lastSpaceIndex + 1));

                    if (currentCustomer != null) {
                        customerList.add(currentCustomer);
                    }
                    
                    currentCustomer = new Customer(idNumber, fullName);
                } else {
                    long accountNumber = Long.parseLong(parts[0]);
                    String accountType = parts[1];
                    double balance = Double.parseDouble(parts[2]);

                    if (accountType.equals(Account.CHECKING)) {
                        currentCustomer.addAccount(new CheckingAccount(accountNumber, balance));
                    } else {
                        currentCustomer.addAccount(new SavingsAccount(accountNumber, balance));
                    }
                }
            }

            if (currentCustomer != null) {
                customerList.add(currentCustomer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Get customers information by name order. */
    public String getCustomersInfoByNameOrder() {
        Collections.sort(customerList, new Comparator<Customer>() {
            public int compare(Customer c1, Customer c2) {
                return c1.getFullName().compareTo(c2.getFullName());
            }
        });

        StringBuilder result = new StringBuilder();
        for (Customer c : customerList) {
            result.append(c.getCustomerInfo() + "\n");
        }

        return result.toString();
    }

    /** Get customers information by ID order. */
    public String getCustomersInfoByIdOrder() {
        Collections.sort(customerList, new Comparator<Customer>() {
            public int compare(Customer c1, Customer c2) {
                if (c1.getIdNumber() < c2.getIdNumber()) {
                    return -1;
                } else if (c1.getIdNumber() > c2.getIdNumber()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        StringBuilder result = new StringBuilder();
        for (Customer c : customerList) {
            result.append(c.getCustomerInfo() + "\n");
        }

        return result.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}