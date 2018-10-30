package omurkumru.com.dataBindingExample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import omurkumru.com.dataBindingExample.databinding.ActivityMainBinding;
import omurkumru.com.dataBindingExample.models.Product;
import omurkumru.com.dataBindingExample.models.UserModel;
import omurkumru.com.dataBindingExample.util.Products;

public class MainActivity extends AppCompatActivity implements IMainActivity{

    //data binding
    ActivityMainBinding mainBinding;

    private Product mProduct;

    private int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Products products = new Products();

        mProduct = products.PRODUCTS[0];
        quantity = 2;

        mainBinding.setProduct(mProduct);
        mainBinding.setQuantity(quantity);
        mainBinding.setIMainActivity(this);
        mainBinding.setTestURL("http://cdn.collider.com/wp-content/uploads/2018/04/deadpool-2-josh-brolin-cable.jpg");


        UserModel userModel = new UserModel();
        userModel.setPass("ChangeMe!");
        mainBinding.setUser(userModel);

    }

    @Override
    public void inflateQuantityDialog() {
        ChooseQuantityDialog chooseQuantityDialog = new ChooseQuantityDialog();
        chooseQuantityDialog.show(getSupportFragmentManager(),getString(R.string.dialog_choose_quantity));
    }

    @Override
    public void setQuantity(int quantity) {
        mainBinding.setQuantity(quantity);
    }
}
