package Van064886.tictactoetrain;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

public class ScoreItemAdapter extends BaseAdapter {

    private Context context;
    private List<ScoreItem> scoreItemList;
    private LayoutInflater inflater;

    public ScoreItemAdapter(Context context, List<ScoreItem> scoreItemList){
        this.context = context;
        this.scoreItemList = scoreItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return scoreItemList.size();
    }

    @Override
    public ScoreItem getItem(int i) {
        return scoreItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.score_item, null);
        ScoreItem currentItem = getItem(i);
        int itemID = currentItem.getId();
        String itemPlayers = currentItem.getPlayers();
        String itemWinner = currentItem.getWinner();
        Date itemDate = currentItem.getDate();

        TextView itemIDView = view.findViewById(R.id.identifier);
        TextView itemPlayersView = view.findViewById(R.id.players);
        TextView itemWinnerView = view.findViewById(R.id.winner);
        TextView itemDateView = view.findViewById(R.id.dateGame);
        itemIDView.setText(Integer.toString(itemID));
        itemPlayersView.setText(itemPlayers);
        itemWinnerView.setText(itemWinner);
        itemDateView.setText(itemDate.toString());

        return view;
    }
}