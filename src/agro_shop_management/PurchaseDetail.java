/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro_shop_management;

/**
 *
 * @author User
 */
public class PurchaseDetail {

    public PurchaseDetail(int productId, int quantity, int q) {
        this.productId = productId;
        this.quantity = quantity;
        this.stockQuantity = q;
    }
    private int productId;
    private int quantity;
    private int stockQuantity;

    public int getStockQuantity() {
        return stockQuantity;
    }
    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
