package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void businessProduct() {
        Product business = new Product("Product", 100.0, "BUSINESS");
        List<Product> products = Arrays.asList(business);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(110.0, business.getPrice(), 0.01);
    }
    @Test
    void homeProduct() {
        Product home = new Product("Product", 100.0, "HOME");
        List<Product> products = Arrays.asList(home);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(90.0, home.getPrice(), 0.01);
    }

    @Test
    void normalProduct() {
        Product normal = new Product("Product", 100.0, "NORMAL");
        List<Product> products = Arrays.asList(normal);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(100.0, normal.getPrice(), 0.01);
    }

    @Test
    void multipleProducts() {
        Product business = new Product("ProductB", 100.0, "BUSINESS");
        Product normal = new Product("ProductN", 100.0, "NORMAL");
        Product home = new Product("ProductH", 100.0, "HOME");
        List<Product> products = Arrays.asList(normal, business, home);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(3, dao.all().size());
    }
}
