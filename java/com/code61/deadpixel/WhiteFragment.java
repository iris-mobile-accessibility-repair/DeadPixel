/*
                    DEAD PIXEL
   Copyright (C) 2015 Code61

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.code61.deadpixel;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class WhiteFragment extends Fragment {

   View view;
   LinearLayout l;

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
   {
      view = inflater.inflate(R.layout.fragment_white, container, false);

      WindowManager.LayoutParams layout = getActivity().getWindow().getAttributes();
      layout.screenBrightness = 1F;
      getActivity().getWindow().setAttributes(layout);
      getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
      getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
      getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

      l = (LinearLayout) view.findViewById(R.id.fragment_white);

      l.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new BlackFragment());
         }
      });


      return view;
   }

}
