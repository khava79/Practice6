package practice12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {

    @Test
    void testAddAndRemoveProduct() {
        InventoryService service = new InventoryService();
        Product computer = new Product("Computer", 150.999, "Electronics");
        service.addProduct(computer);
        Product retrieved = service.getProductByCategory("Electronics");
        assertEquals("Computer", retrieved.getName());
    }

    @Test
    void testAddProductWhileInventoryClosed() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(false);
        service.addProduct(new Product("Watch", 700.00, "Electronics"));
        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Electronics"));
    }

    @Test
    void testOutOfStock() {
        InventoryService service = new InventoryService();
        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Jewelry"));
    }

    @Test
    void testFilteredPrice() {
        InventoryService service = new InventoryService();
        service.addProduct(new Product("Computer", 150, "Electronics"));
        service.addProduct(new Product("Ring", 78, "Jewelry"));
        service.addProduct(new Product("Earrings", 265, "Jewelry"));

        List<Product> filtered = service.filterByPrice(200);
        assertEquals(1, filtered.size());
        assertEquals("Earrings", filtered.get(0).getName());
    }
}
