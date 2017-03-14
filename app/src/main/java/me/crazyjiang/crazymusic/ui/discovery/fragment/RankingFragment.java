package me.crazyjiang.crazymusic.ui.discovery.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import me.crazyjiang.crazymusic.R;
import me.crazyjiang.crazymusic.model.bean.RankingBean;
import me.crazyjiang.crazymusic.presenter.RankingPresenter;
import me.crazyjiang.crazymusic.presenter.contract.RankingContract;
import me.crazyjiang.crazymusic.ui.BaseFragment;
import me.crazyjiang.crazymusic.util.ImageUtil;
import me.crazyjiang.crazymusic.util.TipUtil;

/**
 * Created by Jiangwenjin on 2017/3/13.
 */

public class RankingFragment extends BaseFragment<RankingPresenter> implements RankingContract.View {
    @BindView(R.id.new_poster)
    ImageView newPoster;
    @BindView(R.id.new_song_1)
    TextView newSong1;
    @BindView(R.id.new_song_2)
    TextView newSong2;
    @BindView(R.id.new_song_3)
    TextView newSong3;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_ranking;
    }

    @Override
    protected void inject() {
        getFragmentComponent().inject(this);
    }

    @Override
    protected void init() {
        mPresenter.getNew(3, 0);
    }

    @Override
    public void onNewLoaded(RankingBean rankingBean) {
        ImageUtil.load(mContext, rankingBean.getBillboard().getPic_s640(), newPoster);
        if (null != rankingBean.getSong_list()) {
            if (rankingBean.getSong_list().size() > 0) {
                newSong1.setText("1. " + rankingBean.getSong_list().get(0).getTitle() + " - " + rankingBean.getSong_list().get(0).getArtist_name());
            }
            if (rankingBean.getSong_list().size() > 1) {
                newSong2.setText("2. " + rankingBean.getSong_list().get(1).getTitle() + " - " + rankingBean.getSong_list().get(1).getArtist_name());
            }
            if (rankingBean.getSong_list().size() > 2) {
                newSong3.setText("3. " + rankingBean.getSong_list().get(2).getTitle() + " - " + rankingBean.getSong_list().get(2).getArtist_name());
            }
        }
    }

    @OnClick(R.id.ranking_new)
    public void clickNew(View view) {
        TipUtil.showToast(mActivity, "新歌榜");
    }

    @OnClick(R.id.new_play_all)
    public void clickPlayAll(View view) {
        TipUtil.showToast(mActivity, "play all");
    }
}
