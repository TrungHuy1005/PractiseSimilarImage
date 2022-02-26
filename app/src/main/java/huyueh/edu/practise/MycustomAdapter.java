package huyueh.edu.practise;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Random;

public class MycustomAdapter extends ArrayAdapter {


    public MycustomAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View myView=super.getView(position,convertView,parent);
         Random rand = new Random();
         myView.setBackgroundColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
        return myView;
    }
}
