package com.example.android.barathyvsbarathydasan;

import android.graphics.Paint;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctAnswerCount = 0;
    int answerCount = 0;
    // Barathi is always option1 and Barathidasan is always option2.
    // turn boolean to  true or false based on it.

    /*Barathi - kaatruveliyidai kannamma
    nindran kaadhalai yenni kalikkindren
    amudhootrinai otha idhazhgalum
    nilavoori thadhumbum vizhigalum*/
    boolean ans_q1option1 = true;
    boolean ans_q1option2 = false;


    /*BarathiDasan - Engal Vaazhvum Engal Valamum
    Mangatha Tamizhendru Sangae Muzhangu!
	Engal Pagaivar Engo Marainthar
	Ingulla Tamizhargal Ondraathal Kande!*/
    boolean ans_q2option1 = false;
    boolean ans_q2option2 = true;

    /* BarathiDasan - Summa Kedantha Nethai Kothi
    Sombal illama Yer Nadathi
    Kamma Karaiya Osathi katti
    Karumbu Kolaiyil Vaaikaal Vetti
    Samba Payira Pudingi Nattu
    Thaguntha Moraiyil Thaneer Vittu

    Nellu Velachiruku - Varappum
    Ulla Marainchiruku*/
    boolean ans_q3option1 = false;
    boolean ans_q3option2 = true;

    /* Barathidasan - Avalum Naanum Amuthum Tamizhum
    Avalum Naanum Alaiyum Kadalum
    Avalum Naanum Thavmum Arulum
    Avalum Naanum Verum Maramum*/
    boolean ans_q4option1 = false;
    boolean ans_q4option2 = true;

    /* BarathiDasan - Tamizhukum Amuthendru Per - Antha
    Tamil Inba Tamil Engal Uyiruku Ner!*/
    boolean ans_q5option1 = false;
    boolean ans_q5option2 = true;

    /*Barathi - Paayumoli Nee Ennaku, Paarkumvizhi Naan Unaku
    Thoyumathu Nee Ennaku, Thumbiadi Naan Unaku*/
    boolean ans_q6option1 = true;
    boolean ans_q6option2 = false;

    /* Barathi - Enthaiyum Thaaiyum Mazhinthu Kulaavi
    Irunthathum Innaadae - Athan
    Munthaiyar Aayiram Aandugal Vazhnthu
    Mudinthathum Innaadae*/
    boolean ans_q7option1 = true;
    boolean ans_q7option2 = false;

    /*Barathi - Thayin Manikodi Paarir - Athai
    Thazhnthu Paninthu Pugazhnthida Vaareer*/
    boolean ans_q8option1 = true;
    boolean ans_q8option2 = false;

    /* BarathiDasan - Thoongum Puliyai Pirai kondu Ezhupinom
    Thooya Tamizharai Tamil Kondu Ezhupinom*/
    boolean ans_q9option1 = false;
    boolean ans_q9option2 = true;

    /* Barathi - Theertha Karaiyinilae Therku Moolaiyil Senbaga Thotathilae
    Paarthirunthal Varuven Venillavilae Paangiyodenru Sonnai
    Vaarthai Thavari Vittai Adi Kannama Maarbu Thudikuthadi
    Paartha Edathiellam Unnai Poi Paavai Theriyuthadi*/
    boolean ans_q10option1 = true;
    boolean ans_q10option2 = false;

    //Variables to  receive User Answer from radio button
    boolean r_q1_option1 = false;
    boolean r_q1_option2 = false;
    boolean r_q2_option1 = false;
    boolean r_q2_option2 = false;
    boolean r_q3_option1 = false;
    boolean r_q3_option2 = false;
    boolean r_q4_option1 = false;
    boolean r_q4_option2 = false;
    boolean r_q5_option1 = false;
    boolean r_q5_option2 = false;
    boolean r_q6_option1 = false;
    boolean r_q6_option2 = false;
    boolean r_q7_option1 = false;
    boolean r_q7_option2 = false;
    boolean r_q8_option1 = false;
    boolean r_q8_option2 = false;
    boolean r_q9_option1 = false;
    boolean r_q9_option2 = false;
    boolean r_q10_option1 = false;
    boolean r_q10_option2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This Method gets the quiz answers through radio button and saves in a variable r_q*_option*
     *
     * @param view
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_q1_option1:
                if (checked) {
                    //if option1 is checked then option 2 should be false. if it already checked its our time to change variable holder to false.
                    r_q1_option1 = true;
                    r_q1_option2 = false;
                }
                break;
            case R.id.radio_q1_option2:
                if (checked) {
                    //if option2 is checked then option1 should be false. if it already checked its our time to change variable holder to false.
                    r_q1_option2 = true;
                    r_q1_option1 = false;
                }
                break;
            case R.id.radio_q2_option1:
                if (checked) {
                    r_q2_option1 = true;
                    r_q2_option2 = false;
                }
                break;
            case R.id.radio_q2_option2:
                if (checked) {
                    r_q2_option2 = true;
                    r_q2_option1 = false;
                }
                break;
            case R.id.radio_q3_option1:
                if (checked) {
                    r_q3_option1 = true;
                    r_q3_option2 = false;
                }
                break;
            case R.id.radio_q3_option2:
                if (checked) {
                    r_q3_option2 = true;
                    r_q3_option1 = false;
                }
                break;
            case R.id.radio_q4_option1:
                if (checked) {
                    r_q4_option1 = true;
                    r_q4_option2 = false;
                }
                break;
            case R.id.radio_q4_option2:
                if (checked) {
                    r_q4_option2 = true;
                    r_q4_option1 = false;
                }
                break;
            case R.id.radio_q5_option1:
                if (checked) {
                    r_q5_option1 = true;
                    r_q5_option2 = false;
                }
                break;
            case R.id.radio_q5_option2:
                if (checked) {
                    r_q5_option2 = true;
                    r_q5_option1 = false;
                }
                break;
            case R.id.radio_q6_option1:
                if (checked) {
                    r_q6_option1 = true;
                    r_q6_option2 = false;
                }
                break;
            case R.id.radio_q6_option2:
                if (checked) {
                    r_q6_option2 = true;
                    r_q6_option1 = false;
                }
                break;
            case R.id.radio_q7_option1:
                if (checked) {
                    r_q7_option1 = true;
                    r_q7_option2 = false;
                }
                break;
            case R.id.radio_q7_option2:
                if (checked) {
                    r_q7_option2 = true;
                    r_q7_option1 = false;
                }
                break;
            case R.id.radio_q8_option1:
                if (checked) {
                    r_q8_option1 = true;
                    r_q8_option2 = false;
                }
                break;
            case R.id.radio_q8_option2:
                if (checked) {
                    r_q8_option2 = true;
                    r_q8_option1 = false;
                }
                break;
            case R.id.radio_q9_option1:
                if (checked) {
                    r_q9_option1 = true;
                    r_q9_option2 = false;
                }
                break;
            case R.id.radio_q9_option2:
                if (checked) {
                    r_q9_option2 = true;
                    r_q9_option1 = false;
                }
                break;
            case R.id.radio_q10_option1:
                if (checked) {
                    r_q10_option1 = true;
                    r_q10_option2 = false;
                }
                break;
            case R.id.radio_q10_option2:
                if (checked) {
                    r_q10_option2 = true;
                    r_q10_option1 = false;
                }
                break;

        }
    }

    public void displayLogAnswers() {

        // Correct answers are
        Log.i("CorrectAnswer : ", "1, Barathi");
        Log.i("CorrectAnswer : ", "2, Barathidasan");
        Log.i("CorrectAnswer : ", "3, Barathidasan");
        Log.i("CorrectAnswer : ", "4, Barathidasan");
        Log.i("CorrectAnswer : ", "5, Barathidasan");
        Log.i("CorrectAnswer : ", "6, Barathi");
        Log.i("CorrectAnswer : ", "7, Barathi");
        Log.i("CorrectAnswer : ", "8, Barathi");
        Log.i("CorrectAnswer : ", "9, Barathidasan");
        Log.i("CorrectAnswer : ", "10, Barathi");

        // User answers are
            displayLogiValues(1,r_q1_option1);
            displayLogiValues(2,r_q2_option1);
        displayLogiValues(3,r_q3_option1);
        displayLogiValues(4,r_q4_option1);
        displayLogiValues(5,r_q5_option1);
        displayLogiValues(6,r_q6_option1);
        displayLogiValues(7,r_q7_option1);
        displayLogiValues(8,r_q8_option1);
        displayLogiValues(9,r_q9_option1);
        displayLogiValues(10,r_q10_option1);


        Log.i("Correctly Answered : ", " " + correctAnswerCount);
    }


    public void displayLogiValues(int qno, boolean option){
        if(option)
            Log.i("UserAnswer : " + qno, "Barathi");
        else
            Log.i("UserAnswer : " + qno, "Barathidasan");

    }

    /**
     * Check User Answer and count no of correct answers and display a toast msg and display the answers in info log
     *
     * @param view
     */
    public void CheckQuizAnswer(View view) {

        // reset answercount when submitted again.
        correctAnswerCount = 0;
        answerCount = 0;

        // Check first if quiz question is answered atleast one option should be true
        if ((!r_q1_option1 && r_q1_option2) || (r_q1_option1 && !r_q1_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q1_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q1_option2);
            Paint paint = new Paint();
            // if user answered true turn the answer to green color else turn to  red color
            if ((ans_q1option1 == r_q1_option1) && (ans_q1option2 == r_q1_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck1 : ", " " + correctAnswerCount);
                if (ans_q1option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q1option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q1option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            //if he didnt answer any question disable the radio button
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG1);
            radiogroup.setEnabled(false);
            ++answerCount;
        }
        if ((!r_q2_option1 && r_q2_option2) || (r_q2_option1 && !r_q2_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q2_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q2_option2);

            if ((ans_q2option1 == r_q2_option1) && (ans_q2option2 == r_q2_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck2 : ", " " + correctAnswerCount);
                if (ans_q2option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q2option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q2option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }

        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG2);
            radiogroup.setEnabled(false);
            ++answerCount;
        }
        if ((!r_q3_option1 && r_q3_option2) || (r_q3_option1 && !r_q3_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q3_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q3_option2);

            if ((ans_q3option1 == r_q3_option1) && (ans_q3option2 == r_q3_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck3 : ", " " + correctAnswerCount);
                if (ans_q3option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q3option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q3option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG3);
            radiogroup.setEnabled(false);
            ++answerCount;
        }

        if ((!r_q4_option1 && r_q4_option2) || (r_q4_option1 && !r_q4_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q4_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q4_option2);

            if ((ans_q4option1 == r_q4_option1) && (ans_q4option2 == r_q4_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck4 : ", " " + correctAnswerCount);
                if (ans_q4option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q4option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q4option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG4);
            radiogroup.setEnabled(false);
            ++answerCount;
        }

        if ((!r_q5_option1 && r_q5_option2) || (r_q5_option1 && !r_q5_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q5_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q5_option2);

            if ((ans_q5option1 == r_q5_option1) && (ans_q5option2 == r_q5_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck5 : ", " " + correctAnswerCount);
                if (ans_q5option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q5option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q5option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG5);
            radiogroup.setEnabled(false);
            ++answerCount;
        }

        if ((!r_q6_option1 && r_q6_option2) || (r_q6_option1 && !r_q6_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q6_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q6_option2);

            if ((ans_q6option1 == r_q6_option1) && (ans_q6option2 == r_q6_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck6 : ", " " + correctAnswerCount);
                if (ans_q6option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q6option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q6option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG6);
            radiogroup.setEnabled(false);
            ++answerCount;
        }

        if ((!r_q7_option1 && r_q7_option2) || (r_q7_option1 && !r_q7_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q7_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q7_option2);

            if ((ans_q7option1 == r_q7_option1) && (ans_q7option2 == r_q7_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck7 : ", " " + correctAnswerCount);
                if (ans_q7option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q7option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q7option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG7);
            radiogroup.setEnabled(false);
            ++answerCount;
        }


        if ((!r_q8_option1 && r_q8_option2) || (r_q8_option1 && !r_q8_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q8_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q8_option2);

            if ((ans_q8option1 == r_q8_option1) && (ans_q8option2 == r_q8_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck8 : ", " " + correctAnswerCount);
                if (ans_q8option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q8option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q8option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG8);
            radiogroup.setEnabled(false);
            ++answerCount;
        }

        if ((!r_q9_option1 && r_q9_option2) || (r_q9_option1 && !r_q9_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q9_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q9_option2);

            if ((ans_q9option1 == r_q9_option1) && (ans_q9option2 == r_q9_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck9 : ", " " + correctAnswerCount);
                if (ans_q9option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q9option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q9option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG9);
            radiogroup.setEnabled(false);
            ++answerCount;
        }


        if ((!r_q10_option1 && r_q10_option2) || (r_q10_option1 && !r_q10_option2)) {
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_q10_option1);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_q10_option2);

            if ((ans_q10option1 == r_q10_option1) && (ans_q10option2 == r_q10_option2)) {
                ++correctAnswerCount;
                Log.i("RunCheck10 : ", " " + correctAnswerCount);
                if (ans_q10option1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.green));
                }
            } else if (ans_q10option1) {
                radioButton2.setTextColor(getResources().getColor(R.color.red));
                radioButton2.getPaint().setStrokeWidth(10f);
                radioButton2.getPaint().setStrikeThruText(true);
                radioButton2.setPaintFlags(radioButton2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            } else if (ans_q10option2) {
                radioButton1.setTextColor(getResources().getColor(R.color.red));
                radioButton1.getPaint().setStrokeWidth(10f);
                radioButton1.getPaint().setStrikeThruText(true);
                radioButton1.setPaintFlags(radioButton1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        } else {
            RadioGroup radiogroup = (RadioGroup) findViewById(R.id.RG10);
            radiogroup.setEnabled(false);
            ++answerCount;
        }

        final Toast tag;

            if (correctAnswerCount == 10)
                //Toast.makeText(this, getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg2), Toast.LENGTH_LONG).show();
                //tag.show();
                //tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg2), Toast.LENGTH_SHORT);
                tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount , Toast.LENGTH_SHORT);
            else if (correctAnswerCount >= 7)
                //Toast.makeText(this, getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg3), Toast.LENGTH_LONG).show();
                //tag1.show();
                //tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg3), Toast.LENGTH_SHORT);
                tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount , Toast.LENGTH_SHORT);
            else if (correctAnswerCount >= 4)
                //Toast.makeText(this, getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg4), Toast.LENGTH_LONG).show();
                //tag2.show();
                //tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg4), Toast.LENGTH_SHORT);
                tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount , Toast.LENGTH_SHORT);
            else if (correctAnswerCount >= 1)
                //Toast.makeText(this, getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg5), Toast.LENGTH_LONG).show();
                //tag3.show();
                //tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg5), Toast.LENGTH_SHORT);
                tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount , Toast.LENGTH_SHORT);
            else
               // Toast.makeText(this, getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg6), Toast.LENGTH_LONG).show();
                //tag4.show();
                //tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount + " " + getString(R.string.answermsg6), Toast.LENGTH_SHORT);
                tag = Toast.makeText(getBaseContext(), getString(R.string.answermsg) + (10 - answerCount) + " " + getString(R.string.answermsg1) + correctAnswerCount, Toast.LENGTH_SHORT);

        tag.show();

        new CountDownTimer(9000, 1000)
        {

            public void onTick(long millisUntilFinished) {tag.show();}
            public void onFinish() {tag.show();}

        }.start();

        displayLogAnswers();

    }

    // reset All radio button variables to  false
    public void Replay(View view) {
        r_q1_option1 = false;
        r_q1_option2 = false;
        r_q2_option1 = false;
        r_q2_option2 = false;
        r_q3_option1 = false;
        r_q3_option2 = false;
        r_q4_option1 = false;
        r_q4_option2 = false;
        r_q5_option1 = false;
        r_q5_option2 = false;
        r_q6_option1 = false;
        r_q6_option2 = false;
        r_q7_option1 = false;
        r_q7_option2 = false;
        r_q8_option1 = false;
        r_q8_option2 = false;
        r_q9_option1 = false;
        r_q9_option2 = false;
        r_q10_option1 = false;
        r_q10_option2 = false;
        correctAnswerCount = 0;
        answerCount = 0;

        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_q1_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q1_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q2_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q2_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q3_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q3_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q4_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q4_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q5_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q5_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q6_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q6_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q7_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q7_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q8_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q8_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q9_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q9_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q10_option1);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);
        radioButton = (RadioButton) findViewById(R.id.radio_q10_option2);
        radioButton.setTextColor(getResources().getColor(R.color.radiotextcolor));
        radioButton.setPaintFlags(0);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RG1);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG2);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG3);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG4);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG5);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG6);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG7);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG8);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG9);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);
        radioGroup = (RadioGroup) findViewById(R.id.RG10);
        radioGroup.clearCheck();
        radioGroup.setEnabled(true);

        Toast.makeText(this, getString(R.string.replaymsg), Toast.LENGTH_LONG).show();
    }
}



