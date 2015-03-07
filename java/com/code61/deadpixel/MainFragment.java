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
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

   View view;
   TextView infoButton;
   Button whiteButton;
   Button blackButton;
   Button redButton;
   Button greenButton;
   Button blueButton;
   Button yellowButton;
   Button brownButton;
   Button grayButton;



   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
   {

      view = inflater.inflate(R.layout.fragment_main, container, false);

      getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
      getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
      getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

      //Set ActionBar title
      getActivity().setTitle(getString(R.string.app_name));

      infoButton = (TextView) view.findViewById(R.id.infoButton);
      whiteButton = (Button) view.findViewById(R.id.white_button);
      blackButton = (Button) view.findViewById(R.id.black_button);
      redButton = (Button) view.findViewById(R.id.red_button);
      greenButton = (Button) view.findViewById(R.id.green_button);
      blueButton = (Button) view.findViewById(R.id.blue_button);
      yellowButton = (Button) view.findViewById(R.id.yellow_button);
      brownButton = (Button) view.findViewById(R.id.brown_button);
      grayButton = (Button) view.findViewById(R.id.gray_button);


      infoButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new InfoFragment());
         }
      });

      whiteButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new WhiteFragment());
         }
      });

      blackButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new BlackFragment());
         }
      });

      redButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new RedFragment());
         }
      });

      greenButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new GreenFragment());
         }
      });

      blueButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new BlueFragment());
         }
      });

      yellowButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new YellowFragment());
         }
      });

      brownButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new BrownFragment());
         }
      });

      grayButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            FragmentManager fm = getFragmentManager();
            MainActivity.changeFragment(fm, new GrayFragment());
         }
      });


      return view;
   }

}
