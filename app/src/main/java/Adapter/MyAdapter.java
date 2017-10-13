package Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gohool.myrv.myrecyclerview.MainActivity;
import com.gohool.myrv.myrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

import Model.ListItem;

/**
 * Created by paulodichone on 3/22/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listItem) {
        this.context = context;
        this.listItems = listItem;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new ViewHolder(v, context, (ArrayList<ListItem>) listItems);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);
        holder.name.setText(listItem.getName());
        holder.description.setText(listItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView description;

        public ViewHolder(View view, Context ctx, ArrayList<ListItem> items) {
            super(view);
            listItems = items;
            //get the Activity Context
            context = ctx;

            view.setOnClickListener(this);

            name = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);

        }

        @Override
        public void onClick(View v) {
            //Get int position
            int position = getAdapterPosition();
            ListItem item = listItems.get(position);
            //  Intent intent = new Intent(context, MyActivity.class);
            // Toast.makeText(context, item.getName(), Toast.LENGTH_LONG).show();
            if (position==0) {
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bdjobs.app&hl=en"));
                context.startActivity(link);
            }

            else if(position==1){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.careerguidebd.jobcircular&hl=en"));
                context.startActivity(link);
            }
            else if(position==2){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sobkhobor.govjob&hl=en"));
                context.startActivity(link);
            }
            else if(position==3){
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.dot.matrix.govtjobs&hl=en"));
                context.startActivity(link);

            }
            else if(position==4){
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bd.main.bdjs&hl=en"));
                context.startActivity(link);

            }
            else if(position==5){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mangopeople.jobbangladesh&hl=en"));
                context.startActivity(link);
            }
            else if(position==6){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ejibikadishari.apps&hl=en"));
                context.startActivity(link);
            }
            else if(position==7){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.powergroupbd.chakrionline&hl=en"));
                context.startActivity(link);
            }
            else if(position==8){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abirmilon.weeklyjob&hl=en"));
                context.startActivity(link);
            }
            else if(position==9){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.andromo.dev308822.app490179&hl=en"));
                context.startActivity(link);
            }
            else if (position==10){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.designdew.job.bangladesh&hl=en"));
                context.startActivity(link);
            }
             else if(position==11){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.imabuilder.rkrbd.chakrirkhabar&hl=en"));
                context.startActivity(link);
            }

            else if(position==12){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.andromo.dev308822.app490179&hl=en"));
                context.startActivity(link);
            }
            else if(position==13){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.saimonabir.bdjobspapers&hl=en"));
                context.startActivity(link);
            }
            else if(position==14){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=chakrir.khobor.bd&hl=en"));
                context.startActivity(link);
            }
            else if(position==15){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nahian.chakri&hl=en"));
                context.startActivity(link);
            }
            else if(position==16){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.InnovativeBanglaApps.ChakrirJonnoJobsCare&hl=en"));
                context.startActivity(link);
            }
            else if(position==17){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.atompro.allbdjobnews&hl=en"));
                context.startActivity(link);
            }
            else if(position==18){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nameless.jobsinbd&hl=en"));
                context.startActivity(link);
            }
            else if(position==19){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.kajerbazar.amitapk&hl=en"));
                context.startActivity(link);
            }
            else if(position==20){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.devbd.bdjobs&hl=en"));
                context.startActivity(link);
            }
            else if(position==21){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.atompro.allbdjobnews&hl=en"));
                context.startActivity(link);
            }
            else if(position==22){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mobincube.chakri.sc_H2VSMG&hl=en"));
                context.startActivity(link);
            }
            else if(position==23){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bestbangla.jobs_in_bangladesh&hl=en"));
                context.startActivity(link);
            }


            else if(position==24){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nahian.chakri&hl=en"));
                context.startActivity(link);
            }

            else if(position==25){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.holo.online_income&hl=en"));
                context.startActivity(link);
            }

            else if(position==26){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=bangla.newspaper.bd&hl=en"));
                context.startActivity(link);
            }

            else if(position==27){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.isofttech.bd.isoftjobs&hl=en"));
                context.startActivity(link);
            }

            else if(position==28){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.imabuilder.rkrbd.chakrirkhabar&hl=en"));
                context.startActivity(link);
            }

            else if(position==29){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mcc.bdjobs&hl=en"));
                context.startActivity(link);
            }


            else if(position==30){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mangopeople.jobbangladesh&hl=en"));
                context.startActivity(link);
            }

            else if(position==31){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abrapps.bdgovtjobsfree&hl=en"));
                context.startActivity(link);
            }
            else if(position==32){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.alhikmah.chakrirkobor&hl=en"));
                context.startActivity(link);
            }
            else if(position==33){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=apps.dev.bdjobsites&hl=en"));
                context.startActivity(link);
            }
            else if(position==34){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.jora.android&hl=en"));
                context.startActivity(link);
            }
            else if(position==35){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abirsaimon.bdjobs2study&hl=en"));
                context.startActivity(link);
            }

            else {

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abirmilon.topbdjobscircular&hl=en"));
                context.startActivity(link);
            }
        }
    }
}
