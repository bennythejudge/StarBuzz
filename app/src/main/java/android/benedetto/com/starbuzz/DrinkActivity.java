package android.benedetto.com.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.benedetto.com.starbuzz.Drink;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // show the drinkId in the log
        Log.d("DrinkActivity", "drink id from the intent: " + getIntent().getExtras().get(EXTRA_DRINKID));

        // get the drinkId from the Intent
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);

        // get drink details
        Drink drink = Drink.drinks[drinkId];

        // populate the layout with the drink values
        TextView name = (TextView) findViewById(R.id.drink_name);
        name.setText(drink.getName());

        TextView description = (TextView) findViewById(R.id.drink_description);
        description.setText(drink.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.drink_photo);
        photo.setImageResource(drink.getImageResouceId());
        photo.setContentDescription(drink.getName());
    }
}
