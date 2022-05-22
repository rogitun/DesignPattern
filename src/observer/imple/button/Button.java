package observer.imple.button;

import observer.inter.button.OnClickListener;

public class Button {

    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener){

        this.onClickListener = onClickListener;
    }

    public void click(){
        if(onClickListener!=null)
            onClickListener.onClick();
    }
}
