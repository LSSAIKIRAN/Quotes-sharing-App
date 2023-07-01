package com.kiran.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String q1 = "\"The only way to do great work is to love what you do.\" - Steve Jobs";
    String q2 = "\"In the middle of difficulty lies opportunity.\" - Albert Einstein";
    String q3 = "\"Believe you can and you're halfway there.\" - Theodore Roosevelt";
    String q4 = "\"Success is not final, failure is not fatal: It is the courage to continue that counts.\" - Winston Churchill";
    String q5 = "\"The future belongs to those who believe in the beauty of their dreams.\" - Eleanor Roosevelt";
    String q6 = "\"The best way to predict the future is to create it.\" - Peter Drucker";
    String q7 = "\"Don't watch the clock; do what it does. Keep going.\" - Sam Levenson";
    String q8 = "\"The only limit to our realization of tomorrow will be our doubts of today.\" - Franklin D. Roosevelt";
    String q9 = "\"The greatest glory in living lies not in never falling, but in rising every time we fall.\" - Nelson Mandela";
    String q10 = "\"You miss 100% of the shots you don't take.\" - Wayne Gretzky";
    String q11 = "\"Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.\" - Albert Schweitzer";
    String q12 = "\"The journey of a thousand miles begins with one step.\" - Lao Tzu";
    String q13= "\"The harder I work, the luckier I get.\" - Gary Player";
    String q14= "\"Opportunities don't happen. You create them.\" - Chris Grosser";
    String q15 = "\"I find that the harder I work, the more luck I seem to have.\" - Thomas Jefferson";
    String q16 = "\"Don't be afraid to give up the good to go for the great.\" - John D. Rockefeller";
    String q17= "\"The only person you are destined to become is the person you decide to be.\" - Ralph Waldo Emerson";
    String q18 = "\"Success usually comes to those who are too busy to be looking for it.\" - Henry David Thoreau";
    String q19 = "\"Your time is limited, don't waste it living someone else's life.\" - Steve Jobs";
    String q20= "\"The best revenge is massive success.\" - Frank Sinatra";
    String q21 = "\"The future depends on what you do today.\" - Mahatma Gandhi";
    String q22 = "\"Success is not in what you have, but who you are.\" - Bo Bennett";
    String q23 = "\"The difference between a successful person and others is not a lack of strength, not a lack of knowledge, but rather a lack in will.\" - Vince Lombardi";
    String q24 = "\"Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work.\" - Steve Jobs";
    String q25 = "\"Believe in yourself, take on your challenges, dig deep within yourself to conquer fears. Never let anyone bring you down. You got this.\" - Chantal Sutherland";
    String q26 = "\"You have within you right now, everything you need to deal with whatever the world can throw at you.\" - Brian Tracy";
    String q27 = "\"The best preparation for tomorrow is doing your best today.\" - H. Jackson Brown Jr.";
    String q28 = "\"The only place where success comes before work is in the dictionary.\" - Vidal Sassoon";
    String q29 = "\"If you want to achieve greatness, stop asking for permission.\" - Anonymous";
    String q30 = "\"You are never too old to set another goal or to dream a new dream.\" - C.S. Lewis";

    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList = new ArrayList<>();
        adapter = new Adapter(arrayList);

        recyclerView.setAdapter(adapter);

        arrayList.add(q1);
        arrayList.add(q2);
        arrayList.add(q3);
        arrayList.add(q4);
        arrayList.add(q5);
        arrayList.add(q6);

        arrayList.add(q7);
        arrayList.add(q8);
        arrayList.add(q9);
        arrayList.add(q10);
        arrayList.add(q11);
        arrayList.add(q12);
        arrayList.add(q13);
        arrayList.add(q14);
        arrayList.add(q15);
        arrayList.add(q16);
        arrayList.add(q17);
        arrayList.add(q18);
        arrayList.add(q19);
        arrayList.add(q20);
        arrayList.add(q21);
        arrayList.add(q22);
        arrayList.add(q23);
        arrayList.add(q24);
        arrayList.add(q25);
        arrayList.add(q26);
        arrayList.add(q27);
        arrayList.add(q28);
        arrayList.add(q29);
        arrayList.add(q30);


        adapter.notifyDataSetChanged();


    }
}