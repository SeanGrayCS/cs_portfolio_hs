/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shiftsubs;

import java.util.Arrays;

/**
 *
 * @author seanp
 */
public class ShiftSubs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String subs = "Dialogue: 0,0:00:45.42,0:00:50.21,Subtitle,,0,0,0,,Even I had come to the conclusion that\\Nthe only ability of a healer is to heal.\n" +
"Dialogue: 0,0:00:50.67,0:00:52.83,Subtitle,,0,0,0,,That's why I was continuously exploited.\n" +
"Dialogue: 0,0:00:53.25,0:00:58.00,Subtitle,,0,0,0,,Even if I had realized my mistake,\\Nmy life was already over.\n" +
"Dialogue: 0,0:00:59.50,0:01:03.58,Subtitle,,0,0,0,,I'm going to redo it all,\\Nso I can have the future I desire.\n" +
"Dialogue: 0,0:02:44.46,0:02:46.96,Subtitle,,0,0,0,,That dream... I had it again...\n" +
"Dialogue: 0,0:02:47.42,0:02:48.71,Subtitle,,0,0,0,,Get stronger.\n" +
"Dialogue: 0,0:02:49.71,0:02:51.58,Subtitle,,0,0,0,,What was that?\n" +
"Dialogue: 0,0:02:51.58,0:02:56.00,Subtitle,,0,0,0,,It's like there's always a voice I can hear\\Nthat comes from deep inside me...\n" +
"Dialogue: 0,0:02:57.75,0:02:59.96,Subtitle,,0,0,0,,Keyaru, are you okay?\n" +
"Dialogue: 0,0:03:01.13,0:03:02.13,Subtitle,,0,0,0,,Anna...\n" +
"Dialogue: 0,0:03:04.71,0:03:07.33,Subtitle,,0,0,0,,Stop it. I can do that myself.\n" +
"Dialogue: 0,0:03:07.58,0:03:09.50,Subtitle,,0,0,0,,Was it that dream again?\n" +
"Dialogue: 0,0:03:09.50,0:03:13.13,Subtitle,,0,0,0,,Yeah, the one where I become a hero\\Nand I fight the demon lord...\n" +
"Dialogue: 0,0:03:14.50,0:03:16.08,Subtitle,,0,0,0,,A hero, huh?\n" +
"Dialogue: 0,0:03:16.63,0:03:18.33,Subtitle,,0,0,0,,Hey, do you remember this?\n" +
"Dialogue: 0,0:03:18.33,0:03:24.25,Subtitle,,0,0,0,,When you were little, you said \"I'm going to\\Nbecome a hero and save the entire village!\"\n" +
"Dialogue: 0,0:03:24.63,0:03:26.79,Subtitle,,0,0,0,,That was before I was aware of my limitations...\n" +
"Dialogue: 0,0:03:26.79,0:03:28.46,Subtitle,,0,0,0,,Now that isn't true.\n" +
"Dialogue: 0,0:03:28.46,0:03:30.38,Subtitle,,0,0,0,,It's almost your birthday, right?\n" +
"Dialogue: 0,0:03:30.67,0:03:33.29,Subtitle,,0,0,0,,You're going to become an adult soon.\n" +
"Dialogue: 0,0:03:33.71,0:03:36.67,Subtitle,,0,0,0,,What class do you have your eye on?\n" +
"Dialogue: 0,0:03:36.67,0:03:38.67,Subtitle,,0,0,0,,Swordsman? A magician?\n" +
"Dialogue: 0,0:03:38.67,0:03:42.21,Subtitle,,0,0,0,,Or maybe, as a hero, it'll choose you!\n" +
"Dialogue: 0,0:03:42.58,0:03:45.29,Subtitle,,0,0,0,,I wouldn't mind being chosen for\\Na really great class.\n" +
"Dialogue: 0,0:03:45.75,0:03:46.79,Subtitle,,0,0,0,,If I am...\n" +
"Dialogue: 0,0:03:47.17,0:03:52.83,Subtitle,,0,0,0,,I'll be able to repay you for raising me\\Nas if I were really your child.\n" +
"Dialogue: 0,0:03:52.83,0:03:54.08,Subtitle,,0,0,0,,Keyaru...\n" +
"Dialogue: 0,0:03:59.50,0:04:02.25,Subtitle,,0,0,0,,There's a good yield this year.\\NI'm glad we got so much.\n" +
"Dialogue: 0,0:04:04.00,0:04:07.00,Subtitle,,0,0,0,,Obtain the sight of the spirits...\n" +
"Dialogue: 0,0:04:08.17,0:04:10.63,Subtitle,,0,0,0,,Obtain sight into all of creation...\n" +
"Dialogue: 0,0:04:11.21,0:04:13.46,Subtitle,,0,0,0,,The sight... of the spirits?\n" +
"Dialogue: 0,0:04:24.67,0:04:27.54,Subtitle,,0,0,0,,Where am I going?\n" +
"Dialogue: 0,0:05:01.92,0:05:04.21,Subtitle,,0,0,0,,I am the star spirit.\n" +
"Dialogue: 0,0:05:04.21,0:05:07.46,Subtitle,,0,0,0,,Child of man, what is your desire?\n" +
"Dialogue: 0,0:05:08.38,0:05:09.54,Subtitle,,0,0,0,,The sight...\n" +
"Dialogue: 0,0:05:10.21,0:05:12.96,Subtitle,,0,0,0,,The sight of the spirits that sees all...\n" +
"Dialogue: 0,0:05:14.58,0:05:16.79,Subtitle,,0,0,0,,In accordance with the covenant of old,\n" +
"Dialogue: 0,0:05:16.79,0:05:21.67,Subtitle,,0,0,0,,to repay the kindness given by\\Nyour ancestors to our dear friends,\n" +
"Dialogue: 0,0:05:21.67,0:05:24.25,Subtitle,,0,0,0,,I shall grant you the power of the spirits.\n" +
"Dialogue: 0,0:05:41.04,0:05:42.17,Subtitle,,0,0,0,,I see it...\n" +
"Dialogue: 0,0:05:42.17,0:05:46.83,Subtitle,,0,0,0,,I can see the status of the spirit and\\Neven her true name floating in mana of the air.\n" +
"Dialogue: 0,0:05:58.79,0:06:00.25,Subtitle,,0,0,0,,Humans...\n" +
"Dialogue: 0,0:06:00.25,0:06:02.79,Subtitle,,0,0,0,,Do you intend to take it all from us,\n" +
"Dialogue: 0,0:06:02.79,0:06:07.29,Subtitle,,0,0,0,,from the land of our dead to the only place\\Nthose of us who are left can rest?!\n" +
"Dialogue: 0,0:06:07.58,0:06:09.21,Subtitle,,0,0,0,,Bullet! Open fire!\n" +
"Dialogue: 0,0:06:09.50,0:06:10.50,Subtitle,,0,0,0,,On it!\n" +
"Dialogue: 0,0:06:25.71,0:06:27.42,Subtitle,,0,0,0,,That's about level seven magic.\n" +
"Dialogue: 0,0:06:28.92,0:06:29.92,Subtitle,,0,0,0,,Mjölnir!\n" +
"Dialogue: 0,0:06:40.58,0:06:41.50,Subtitle,,0,0,0,,Finish this!\n" +
"Dialogue: 0,0:06:43.38,0:06:45.29,Subtitle,,0,0,0,,Leave the rest to me!\n" +
"Dialogue: 0,0:06:47.38,0:06:48.63,Subtitle,,0,0,0,,Don't underestimate me!\n" +
"Dialogue: 0,0:07:05.63,0:07:06.46,Subtitle,,0,0,0,,Damnit!\n" +
"Dialogue: 0,0:07:09.63,0:07:12.83,Subtitle,,0,0,0,,Humans, witness the power of the Demon Lord!\n" +
"Dialogue: 0,0:07:37.54,0:07:40.17,Subtitle,,0,0,0,,Hey, dimwit! Get over here and heal her!\n" +
"Dialogue: 0,0:07:40.54,0:07:42.46,Subtitle,,0,0,0,,We're all out of elixir!\n" +
"Dialogue: 0,0:07:42.46,0:07:45.13,Subtitle,,0,0,0,,Healing's all you're good for\\Nso hurry up and get to it!\n" +
"Dialogue: 0,0:07:45.42,0:07:49.46,Subtitle,,0,0,0,,We only kept you alive so we could\\Nuse you for healing, you know!\n" +
"Dialogue: 0,0:07:53.33,0:07:57.63,Subtitle,,0,0,0,,Right. In my first go at life, I was a healer...\n" +
"Dialogue: 0,0:07:58.13,0:08:02.42,Subtitle,,0,0,0,,Exactly as the name implies,\\NI revive and heal the injured.\n" +
"Dialogue: 0,0:08:03.00,0:08:05.92,Subtitle,,0,0,0,,However, there was a fatal drawback to healing.\n" +
"Dialogue: 0,0:08:06.63,0:08:11.13,Subtitle,,0,0,0,,I see all the experiences of the person I heal\\Nstream in front of me in an instant.\n" +
"Dialogue: 0,0:08:11.50,0:08:16.50,Subtitle,,0,0,0,,There was unimaginable fear and suffering,\\Nthings that couldn't be endured with a sane mind.\n" +
"Dialogue: 0,0:08:17.17,0:08:22.08,Subtitle,,0,0,0,,Truthfully, I ran away countless times\\Nbecause I didn't want to use my healing powers.\n" +
"Dialogue: 0,0:08:23.04,0:08:26.13,Subtitle,,0,0,0,,But no matter how many times I escaped,\\NI always ended up getting caught again.\n" +
"Dialogue: 0,0:08:26.13,0:08:28.50,Subtitle,,0,0,0,,I was made into a heavy addict,\n" +
"Dialogue: 0,0:08:30.29,0:08:34.38,Subtitle,,0,0,0,,and conditioned to happily\\Nuse my healing for those drugs.\n" +
"Dialogue: 0,0:08:37.04,0:08:40.50,Subtitle,,0,0,0,,They kept using me and treating me like livestock.\n" +
"Dialogue: 0,0:08:42.29,0:08:43.29,Subtitle,,0,0,0,,But...\n" +
"Dialogue: 0,0:08:48.17,0:08:50.58,Subtitle,,0,0,0,,You really think I'd heal someone like you?\n" +
"Dialogue: 0,0:08:50.58,0:08:52.50,Subtitle,,0,0,0,,Die, you disgusting piece of trash.\n" +
"Dialogue: 0,0:08:52.83,0:08:55.21,Subtitle,,0,0,0,,Are you... in your right mind?!\n" +
"Dialogue: 0,0:08:55.67,0:08:59.25,Subtitle,,0,0,0,,A year ago I happened to gain\\Nthe skill of \"drug resistance.\"\n" +
"Dialogue: 0,0:08:59.67,0:09:01.42,Subtitle,,0,0,0,,I've been waiting for this chance.\n" +
"Dialogue: 0,0:09:01.71,0:09:03.79,Subtitle,,0,0,0,,Chance? For what?!\n" +
"Dialogue: 0,0:09:04.04,0:09:06.96,Subtitle,,0,0,0,,To defeat the demon lord myself!\n" +
"Dialogue: 0,0:09:07.13,0:09:08.54,Subtitle,,0,0,0,,Now is the time!\n" +
"Dialogue: 0,0:09:08.54,0:09:11.25,Subtitle,,0,0,0,,Y-you lunatic!\\NYou're not strong enough to fight!\n" +
"Dialogue: 0,0:09:11.25,0:09:13.08,Subtitle,,0,0,0,,Come back here and heal me!\n" +
"Dialogue: 0,0:09:15.92,0:09:16.88,Subtitle,,0,0,0,,Too slow!\n" +
"Dialogue: 0,0:09:21.38,0:09:25.25,Subtitle,,0,0,0,,This power was brought about by my actions\\Nas well as the side effects of healing.\n" +
"Dialogue: 0,0:09:25.79,0:09:29.42,Subtitle,,0,0,0,,I relived the experiences of countless others,\n" +
"Dialogue: 0,0:09:29.42,0:09:32.63,Subtitle,,0,0,0,,imitated their techniques,\\Nand made them into my own.\n" +
"Dialogue: 0,0:09:35.67,0:09:36.67,Subtitle,,0,0,0,,Heal!\n" +
"Dialogue: 0,0:09:43.58,0:09:45.33,Subtitle,,0,0,0,,Who are you?\n" +
"Dialogue: 0,0:09:46.13,0:09:48.08,Subtitle,,0,0,0,,I am a Hero of Recovery, Keyaru.\n" +
"Dialogue: 0,0:09:48.08,0:09:49.33,Subtitle,,0,0,0,,I'm a healer.\n" +
"Dialogue: 0,0:09:50.04,0:09:52.08,Subtitle,,0,0,0,,But I don't just cure people.\n" +
"Dialogue: 0,0:09:52.79,0:09:55.71,Subtitle,,0,0,0,,It's imitation healing, where I make\\Nthe other person's skills my own.\n" +
"Dialogue: 0,0:09:56.38,0:09:59.83,Subtitle,,0,0,0,,An improved healing, where I can\\Nchange flesh into any form I wish.\n" +
"Dialogue: 0,0:10:03.29,0:10:05.75,Subtitle,,0,0,0,,An insta-kill, deteriorating healing!\n" +
"Dialogue: 0,0:10:13.54,0:10:14.38,Subtitle,,0,0,0,,Heal.\n" +
"Dialogue: 0,0:10:16.25,0:10:18.96,Subtitle,,0,0,0,,All of that is my healing power!\n" +
"Dialogue: 0,0:10:25.88,0:10:26.79,Subtitle,,0,0,0,,Heal!\n" +
"Dialogue: 0,0:10:28.67,0:10:30.54,Subtitle,,0,0,0,,If I can just reach it...\n" +
"Dialogue: 0,0:10:34.54,0:10:35.54,Subtitle,,0,0,0,,I got it!\n" +
"Dialogue: 0,0:10:39.63,0:10:43.13,Subtitle,,0,0,0,,I see, so this is the end for me too.\n" +
"Dialogue: 0,0:10:44.13,0:10:47.21,Subtitle,,0,0,0,,How upsetting... That I couldn't protect it...\n" +
"Dialogue: 0,0:10:49.21,0:10:51.21,Subtitle,,0,0,0,,Don't worry.\n" +
"Dialogue: 0,0:10:51.58,0:10:53.13,Subtitle,,0,0,0,,We're starting over.\n" +
"Dialogue: 0,0:10:53.79,0:10:54.71,Subtitle,,0,0,0,,Heal.\n" +
"Dialogue: 0,0:11:11.71,0:11:15.00,Subtitle,,0,0,0,,Well done, Keyaru, Hero of Recovery.\n" +
"Dialogue: 0,0:11:15.00,0:11:18.67,Subtitle,,0,0,0,,Father... I mean the king will be pleased.\n" +
"Dialogue: 0,0:11:19.25,0:11:21.67,Subtitle,,0,0,0,,You were hiding an elixir?\n" +
"Dialogue: 0,0:11:22.17,0:11:25.71,Subtitle,,0,0,0,,That jewel has been cursed by the demon\\Nand is therefore dangerous.\n" +
"Dialogue: 0,0:11:25.71,0:11:29.08,Subtitle,,0,0,0,,As a hero with the appropriate skills,\\NI will take care of it.\n" +
"Dialogue: 0,0:11:30.33,0:11:31.67,Subtitle,,0,0,0,,The philosopher's stone...\n" +
"Dialogue: 0,0:11:31.67,0:11:34.42,Subtitle,,0,0,0,,Oh, I see you know about it.\n" +
"Dialogue: 0,0:11:34.42,0:11:37.79,Subtitle,,0,0,0,,To think something with a name like that\\Nwas attached to the heart of the demon lord.\n" +
"Dialogue: 0,0:11:38.17,0:11:41.88,Subtitle,,0,0,0,,I know that you lot are going to use\\Nan incantation on the philosopher's stone\n" +
"Dialogue: 0,0:11:41.88,0:11:46.75,Subtitle,,0,0,0,,and make the absurd delusion of\\Nworld domination into a reality...\n" +
"Dialogue: 0,0:11:47.08,0:11:49.08,Subtitle,,0,0,0,,What are you talking about?\n" +
"Dialogue: 0,0:11:49.08,0:11:54.25,Subtitle,,0,0,0,,With this philosopher's stone,\\NI can invoke magic akin to a god...\n" +
"Dialogue: 0,0:11:56.58,0:11:59.04,Subtitle,,0,0,0,,I'm going to use this power to heal.\n" +
"Dialogue: 0,0:11:59.50,0:12:01.88,Subtitle,,0,0,0,,There's something that I must cure,\\Nno matter what.\n" +
"Dialogue: 0,0:12:02.21,0:12:03.92,Subtitle,,0,0,0,,Something you have to cure...?\n" +
"Dialogue: 0,0:12:03.92,0:12:08.54,Subtitle,,0,0,0,,I'm going to heal this corrupt world\\Nand go back to before I met you.\n" +
"Dialogue: 0,0:12:08.54,0:12:13.58,Subtitle,,0,0,0,,Y-you would lose all of your memories,\\Nwere you even able to do that!\n" +
"Dialogue: 0,0:12:13.58,0:12:16.00,Subtitle,,0,0,0,,You would have the same life over again!\n" +
"Dialogue: 0,0:12:16.46,0:12:20.42,Subtitle,,0,0,0,,Even if it all disappears\\NI will never forget this pain.\n" +
"Dialogue: 0,0:12:20.42,0:12:23.92,Subtitle,,0,0,0,,The despair of losing myself... the anguish!\n" +
"Dialogue: 0,0:12:23.92,0:12:26.42,Subtitle,,0,0,0,,All of it carved away at my soul!\n" +
"Dialogue: 0,0:12:27.08,0:12:30.25,Subtitle,,0,0,0,,Even if time is rewound and I lose my memories...\n" +
"Dialogue: 0,0:12:30.79,0:12:32.29,Subtitle,,0,0,0,,those will never disappear!\n" +
"Dialogue: 0,0:12:33.46,0:12:34.75,Subtitle,,0,0,0,,Goodbye.\n" +
"Dialogue: 0,0:12:36.08,0:12:40.71,Subtitle,,0,0,0,,If we meet once again when I restart this life,\\NI'll be sure to take everything from you.\n" +
"Dialogue: 0,0:12:40.71,0:12:42.58,Subtitle,,0,0,0,,Stop this!\n" +
"Dialogue: 0,0:12:42.58,0:12:45.21,Subtitle,,0,0,0,,You filthy cur!!\n" +
"Dialogue: 0,0:12:45.21,0:12:50.83,Subtitle,,0,0,0,,I can't wait to hear how you'll address me\\Nwhen I redo this world!\n" +
"Dialogue: 0,0:12:51.25,0:12:52.33,Subtitle,,0,0,0,,Heal!\n" +
"Dialogue: 0,0:13:07.33,0:13:10.21,Subtitle,,0,0,0,,I see... So that's what happened.\n" +
"Dialogue: 0,0:13:11.42,0:13:14.21,Subtitle,,0,0,0,,I got myself back. Thank you.\n" +
"Dialogue: 0,0:13:17.88,0:13:20.42,Subtitle,,0,0,0,,The \"Halcyon Eye\" which sees all of creation...\n" +
"Dialogue: 0,0:13:20.92,0:13:23.92,Subtitle,,0,0,0,,This is when I start my revenge, huh?\n" +
"Dialogue: 0,0:13:25.88,0:13:27.63,Subtitle,,0,0,0,,I made a promise.\n" +
"Dialogue: 0,0:13:27.63,0:13:30.17,Subtitle,,0,0,0,,This time around,\\NI'm going to take it all from that woman...\n" +
"Dialogue: 0,0:13:30.71,0:13:33.17,Subtitle,,0,0,0,,I'm going to take everything from Flare!\n" +
"Dialogue: 0,0:13:45.79,0:13:46.96,Subtitle,,0,0,0,,This is it...\n" +
"Dialogue: 0,0:13:54.71,0:13:59.71,Subtitle,,0,0,0,,My birthday came, and just like my first\\Ngo at life, I was chosen as a hero.\n" +
"Dialogue: 0,0:14:00.67,0:14:03.79,Subtitle,,0,0,0,,Just as planned, my status was again a healer.\n" +
"Dialogue: 0,0:14:07.25,0:14:13.00,Subtitle,,0,0,0,,I kept eating narcotic plants and mushrooms\\Nin order to build a resistance to them.\n" +
"Dialogue: 0,0:14:14.75,0:14:18.04,Subtitle,,0,0,0,,If Flare drugs me and I lose my sense of self,\n" +
"Dialogue: 0,0:14:18.04,0:14:20.71,Subtitle,,0,0,0,,my life will go the same way it did before.\n" +
"Dialogue: 0,0:14:25.71,0:14:26.79,Subtitle,,0,0,0,,What's this about?\n" +
"Dialogue: 0,0:14:27.42,0:14:30.29,Subtitle,,0,0,0,,Hello, people of Alban Village.\n" +
"Dialogue: 0,0:14:30.29,0:14:33.83,Subtitle,,0,0,0,,I am the eldest princess of the Gioral Kingdom,\n" +
"Dialogue: 0,0:14:33.83,0:14:37.17,Subtitle,,0,0,0,,Flare Earlgrande Gioral, a Hero of Magic.\n" +
"Dialogue: 0,0:14:37.17,0:14:37.92,Subtitle,,0,0,0,,A princess?!\n" +
"Dialogue: 0,0:14:37.92,0:14:39.13,Subtitle,,0,0,0,,Did she say \"magic\"?!\n" +
"Dialogue: 0,0:14:39.13,0:14:40.08,Subtitle,,0,0,0,,That really her?!\n" +
"Dialogue: 0,0:14:40.08,0:14:44.96,Subtitle,,0,0,0,,I have come here today to meet the new hero\\Nwho has come into this world.\n" +
"Dialogue: 0,0:14:44.96,0:14:45.83,Subtitle,,0,0,0,,Hero?\n" +
"Dialogue: 0,0:14:45.83,0:14:46.25,Subtitle,,0,0,0,,Who's she talking about?\n" +
"Dialogue: 0,0:14:46.25,0:14:46.96,Subtitle-2,,0,0,0,,Do we have one of those?\\N{\\rSubtitle}Who's she talking about?{\\r}\n" +
"Dialogue: 0,0:14:46.96,0:14:48.17,Subtitle-2,,0,0,0,,Do we have one of those?\n" +
"Dialogue: 0,0:14:54.25,0:14:56.46,Subtitle,,0,0,0,,You're one of us, aren't you?\n" +
"Dialogue: 0,0:14:57.83,0:14:59.00,Subtitle,,0,0,0,,Keyaru?\n" +
"Dialogue: 0,0:14:59.00,0:15:00.50,Subtitle,,0,0,0,,I'm... a hero?\n" +
"Dialogue: 0,0:15:00.50,0:15:04.42,Subtitle,,0,0,0,,That symbol carved into your left hand\\Nis the very proof that you are the hero.\n" +
"Dialogue: 0,0:15:05.83,0:15:06.92,Subtitle,,0,0,0,,Keyaru...\n" +
"Dialogue: 0,0:15:07.29,0:15:08.54,Subtitle,,0,0,0,,Congratulations!\n" +
"Dialogue: 0,0:15:08.54,0:15:10.25,Subtitle,,0,0,0,,Congratulations, Keyaru!\n" +
"Dialogue: 0,0:15:12.58,0:15:13.67,Subtitle,,0,0,0,,Go on...\n" +
"Dialogue: 0,0:15:19.00,0:15:23.83,Subtitle,,0,0,0,,We shall work together and save the world\\Nfrom the menace of the demon lord.\n" +
"Dialogue: 0,0:15:25.17,0:15:28.17,Subtitle,,0,0,0,,How wonderful. I'm so glad!\n" +
"Dialogue: 0,0:15:32.33,0:15:35.29,Subtitle,,0,0,0,,Not surprising that everyone here\\Nis directly involved with Flare.\n" +
"Dialogue: 0,0:15:35.29,0:15:39.08,Subtitle,,0,0,0,,The commander Leonard is enormously capable,\\Nall the other members are the same.\n" +
"Dialogue: 0,0:15:39.46,0:15:40.58,Subtitle,,0,0,0,,Keyaru?\n" +
"Dialogue: 0,0:15:41.17,0:15:45.50,Subtitle,,0,0,0,,Oh, well, i-it just hasn't hit me that I'm a hero yet.\n" +
"Dialogue: 0,0:15:46.50,0:15:48.21,Subtitle,,0,0,0,,There's no need to worry.\n" +
"Dialogue: 0,0:15:48.21,0:15:52.17,Subtitle,,0,0,0,,I, as a more experienced hero,\\Nwill teach you many different things.\n" +
"Dialogue: 0,0:15:52.17,0:15:54.58,Subtitle,,0,0,0,,Thank you, Your Highness.\n" +
"Dialogue: 0,0:15:54.58,0:15:58.46,Subtitle,,0,0,0,,From here on, there's no need for you\\Nto address me so formally.\n" +
"Dialogue: 0,0:15:58.79,0:16:02.58,Subtitle,,0,0,0,,You and I are heroes, and we stand as equals.\n" +
"Dialogue: 0,0:16:02.96,0:16:05.88,Subtitle,,0,0,0,,Yes, Prin- Er, sure thing.\n" +
"Dialogue: 0,0:16:07.00,0:16:08.58,Subtitle,,0,0,0,,That will work.\n" +
"Dialogue: 0,0:16:14.67,0:16:16.13,Subtitle,,0,0,0,,There she is!\n" +
"Dialogue: 0,0:16:16.17,0:16:17.58,Subtitle,,0,0,0,,Welcome back!\n" +
"Dialogue: 0,0:16:17.67,0:16:18.79,Subtitle,,0,0,0,,Your Highness!\n" +
"Dialogue: 0,0:16:21.13,0:16:22.88,Subtitle,,0,0,0,,Isn't this a beautiful town?\n" +
"Dialogue: 0,0:16:22.88,0:16:23.71,Subtitle,,0,0,0,,Yes...\n" +
"Dialogue: 0,0:16:24.29,0:16:25.88,Subtitle,,0,0,0,,I knew...\n" +
"Dialogue: 0,0:16:27.08,0:16:30.38,Subtitle,,0,0,0,,I knew the imperial capital itself\\Nwas filthy in many ways.\n" +
"Dialogue: 0,0:16:30.83,0:16:32.33,Subtitle,,0,0,0,,The capital was created\n" +
"Dialogue: 0,0:16:32.33,0:16:34.63,Subtitle,,0,0,0,,when they burned the village of the indigenous\\Ndemi-humans that lived here to the ground,\n" +
"Dialogue: 0,0:16:34.63,0:16:37.29,Subtitle,,0,0,0,,stole their lands,\\Nand made the survivors into slaves.\n" +
"Dialogue: 0,0:16:38.54,0:16:41.96,Subtitle,,0,0,0,,This city is just as beautiful as you are, Freya.\n" +
"Dialogue: 0,0:16:42.42,0:16:45.71,Subtitle,,0,0,0,,Wonderful. I'm very proud of this city.\n" +
"Dialogue: 0,0:16:46.04,0:16:51.63,Subtitle,,0,0,0,,We are fighting in order to protect the city,\\Nand everyone's smiles.\n" +
"Dialogue: 0,0:16:59.21,0:17:01.13,Subtitle,,0,0,0,,This strength is something else...\n" +
"Dialogue: 0,0:17:01.13,0:17:02.96,Subtitle,,0,0,0,,It's just like a monster's.\n" +
"Dialogue: 0,0:17:03.29,0:17:06.79,Subtitle,,0,0,0,,When I make something happen,\\NI have to do it when the king isn't around.\n" +
"Dialogue: 0,0:17:07.83,0:17:11.21,Subtitle,,0,0,0,,At this point in time, Norn is away,\\Nstudying in another country.\n" +
"Dialogue: 0,0:17:11.21,0:17:13.71,Subtitle,,0,0,0,,I'm glad there's no one around\\Nthat I need to worry about.\n" +
"Dialogue: 0,0:17:23.17,0:17:27.54,Subtitle,,0,0,0,,According to the analysis,\\Nyou are of the \"Healer\" class.\n" +
"Dialogue: 0,0:17:28.33,0:17:31.21,Subtitle,,0,0,0,,You are what our country has been seeking.\n" +
"Dialogue: 0,0:17:31.67,0:17:34.42,Subtitle,,0,0,0,,I am pleased with your awakening powers.\n" +
"Dialogue: 0,0:17:34.42,0:17:38.13,Subtitle,,0,0,0,,I hereby grant you the title of the Hero of Recovery.\n" +
"Dialogue: 0,0:17:38.92,0:17:41.04,Subtitle,,0,0,0,,I-I gratefully accept.\n" +
"Dialogue: 0,0:17:41.04,0:17:44.71,Subtitle,,0,0,0,,I, Keyaru, from this point forward,\\Nwill take the hero title of \"Healer\".\n" +
"Dialogue: 0,0:17:45.04,0:17:50.04,Subtitle,,0,0,0,,If you have the power of a hero, then you may\\Nbe able to heal our great swordsman as well.\n" +
"Dialogue: 0,0:17:50.38,0:17:52.21,Subtitle,,0,0,0,,A swordsman?\n" +
"Dialogue: 0,0:17:52.67,0:17:57.58,Subtitle,,0,0,0,,Yes, on her swordsmanship alone\\Nshe far exceeded the heroes of the blade,\n" +
"Dialogue: 0,0:17:57.58,0:18:00.83,Subtitle,,0,0,0,,but the other day when she was defeated\\Nby a high-ranking class of demons,\n" +
"Dialogue: 0,0:18:00.83,0:18:03.00,Subtitle,,0,0,0,,her arm was taken from her.\n" +
"Dialogue: 0,0:18:03.54,0:18:04.92,Subtitle,,0,0,0,,I understand.\n" +
"Dialogue: 0,0:18:04.92,0:18:07.75,Subtitle,,0,0,0,,I will devote my power to this country.\n" +
"Dialogue: 0,0:18:08.00,0:18:09.88,Subtitle,,0,0,0,,Your devotion is appreciated.\n" +
"Dialogue: 0,0:18:09.88,0:18:11.25,Subtitle,,0,0,0,,You may leave.\n" +
"Dialogue: 0,0:18:19.83,0:18:22.58,Subtitle,,0,0,0,,Culture, etiquette, swordsmanship...\n" +
"Dialogue: 0,0:18:22.58,0:18:24.50,Subtitle,,0,0,0,,heroes sure have it rough.\n" +
"Dialogue: 0,0:18:24.75,0:18:26.08,Subtitle,,0,0,0,,I knew that, though...\n" +
"Dialogue: 0,0:18:26.54,0:18:28.08,Subtitle,,0,0,0,,I should get up...\n" +
"Dialogue: 0,0:18:32.25,0:18:33.29,Subtitle,,0,0,0,,Wh-what is it?\n" +
"Dialogue: 0,0:18:37.75,0:18:39.38,Subtitle,,0,0,0,,Wh-what do you want?\n" +
"Dialogue: 0,0:18:39.38,0:18:41.83,Subtitle,,0,0,0,,Hero, please sleep with me.\n" +
"Dialogue: 0,0:18:41.83,0:18:43.63,Subtitle,,0,0,0,,S-stop! Stop it!\n" +
"Dialogue: 0,0:18:44.04,0:18:46.38,Subtitle,,0,0,0,,There's no need to be frightened.\n" +
"Dialogue: 0,0:18:46.38,0:18:48.54,Subtitle,,0,0,0,,Now, let me take care of you...\n" +
"Dialogue: 0,0:18:52.38,0:18:53.71,Subtitle,,0,0,0,,How cute.\n" +
"Dialogue: 0,0:18:53.71,0:18:57.83,Subtitle,,0,0,0,,You say you don't want to, but it seems like\\Nyou're feeling pretty heroic down here...\n" +
"Dialogue: 0,0:19:04.25,0:19:05.63,Subtitle,,0,0,0,,Cute...\n" +
"Dialogue: 0,0:19:05.63,0:19:08.63,Subtitle,,0,0,0,,If you do it with a hero do you think you'll go past\\Nyour potential and get stronger?\n" +
"Dialogue: 0,0:19:09.33,0:19:12.75,Subtitle,,0,0,0,,I mean, I was happy about it at first though.\n" +
"Dialogue: 0,0:19:12.96,0:19:14.04,Subtitle,,0,0,0,,Now then...\n" +
"Dialogue: 0,0:19:14.04,0:19:14.96,Subtitle,,0,0,0,,Heal.\n" +
"Dialogue: 0,0:19:16.58,0:19:19.79,Subtitle,,0,0,0,,I stole your experience through predatory healing...\n" +
"Dialogue: 0,0:19:20.42,0:19:24.21,Subtitle,,0,0,0,,From then on I slept with the maids\\Nevery night on a rotating basis,\n" +
"Dialogue: 0,0:19:24.21,0:19:25.79,Subtitle,,0,0,0,,and I took their experience too...\n" +
"Dialogue: 0,0:19:26.25,0:19:28.83,Subtitle,,0,0,0,,I got as much as I wanted from them.\n" +
"Dialogue: 0,0:19:40.92,0:19:42.75,Subtitle,,0,0,0,,Let's do it again sometime, okay?\n" +
"Dialogue: 0,0:19:46.17,0:19:50.96,Subtitle,,0,0,0,,Until the great swordsman makes it to the castle,\\NI have to get all the experience that I need...\n" +
"Dialogue: 0,0:19:52.00,0:19:53.83,Subtitle,,0,0,0,,Several days passed.\n" +
"Dialogue: 0,0:19:53.83,0:19:58.08,Subtitle,,0,0,0,,I gained a great deal of knowledge,\\Nand I also enjoyed my nighttime visitors.\n" +
"Dialogue: 0,0:19:59.04,0:20:00.21,Subtitle,,0,0,0,,And then...\n" +
"Dialogue: 0,0:20:03.17,0:20:06.38,Subtitle,,0,0,0,,The great swordsman Kureha Krylet\\Narrived at the castle.\n" +
"Dialogue: 0,0:20:08.00,0:20:10.63,Subtitle,,0,0,0,,You are the recovery healer, Keyaru, right?\n" +
"Dialogue: 0,0:20:10.83,0:20:15.58,Subtitle,,0,0,0,,Yes, it's a pleasure to meet you,\\NGreat Swordsman Kureha Krylet.\n" +
"Dialogue: 0,0:20:20.29,0:20:21.96,Subtitle,,0,0,0,,Please do this for me.\n" +
"Dialogue: 0,0:20:22.29,0:20:24.17,Subtitle,,0,0,0,,I-I'll try my best.\n" +
"Dialogue: 0,0:20:24.92,0:20:27.92,Subtitle,,0,0,0,,I'll do this again, so I can have my revenge.\n" +
"Dialogue: 0,0:20:28.17,0:20:30.92,Subtitle,,0,0,0,,So at the end of my life, I will be the victor.\n" +
"Dialogue: 0,0:20:31.88,0:20:33.17,Subtitle,,0,0,0,,Here I go...\n" +
"Dialogue: 0,0:20:33.17,0:20:34.08,Subtitle,,0,0,0,,Heal!\n" +
"Dialogue: 0,0:21:00.63,0:21:01.79,Subtitle,,0,0,0,,A miracle...\n" +
"Dialogue: 0,0:21:01.79,0:21:04.75,Subtitle,,0,0,0,,It's a miracle! Now I can fight once more!\n" +
"Dialogue: 0,0:21:04.75,0:21:06.38,Subtitle,,0,0,0,,Thank you, Keyaru!\n" +
"Dialogue: 0,0:21:08.75,0:21:09.96,Subtitle,,0,0,0,,Are you okay?!\n" +
"Dialogue: 0,0:21:09.96,0:21:11.25,Subtitle,,0,0,0,,This is unfortunate.\n" +
"Dialogue: 0,0:21:11.25,0:21:13.46,Subtitle,,0,0,0,,The hero of healing must be treated...\n" +
"Dialogue: 0,0:21:13.63,0:21:14.92,Subtitle,,0,0,0,,B-but...\n" +
"Dialogue: 0,0:21:15.21,0:21:18.67,Subtitle,,0,0,0,,Kureha, go show the king\\Nand everyone else your arm.\n" +
"Dialogue: 0,0:21:18.67,0:21:20.08,Subtitle,,0,0,0,,R-right...\n" +
"Dialogue: 0,0:21:22.50,0:21:25.21,Subtitle,,0,0,0,,Thank you for allowing me to wield the sword again.\n" +
"Dialogue: 0,0:21:25.21,0:21:26.92,Subtitle,,0,0,0,,I will never forget this act of kindness.\n" +
"Dialogue: 0,0:21:27.33,0:21:32.50,Subtitle,,0,0,0,,I, the great swordsman Kureha Krylet, will use\\Nall of my ability to return this favor to you in due time.\n" +
"Dialogue: 0,0:21:39.17,0:21:42.88,Subtitle,,0,0,0,,He can't even use his healing well,\\Nand that's the one thing he's good for.\n" +
"Dialogue: 0,0:21:42.88,0:21:44.29,Subtitle,,0,0,0,,This won't do.\n" +
"Dialogue: 0,0:21:44.67,0:21:47.92,Subtitle,,0,0,0,,No, Princess Flare this is most impressive!\n" +
"Dialogue: 0,0:21:47.92,0:21:51.08,Subtitle,,0,0,0,,What this man used is not simple healing!\n" +
"Dialogue: 0,0:21:51.75,0:21:56.13,Subtitle,,0,0,0,,Originally when healing, only the injuries that\\Nthe human body can cure on it's own are affected.\n" +
"Dialogue: 0,0:21:56.13,0:21:58.04,Subtitle,,0,0,0,,However, it is different with this man!\n" +
"Dialogue: 0,0:21:58.33,0:22:01.42,Subtitle,,0,0,0,,I want to investigate this...\\NIf I can find an explanation...\n" +
"Dialogue: 0,0:22:01.42,0:22:04.21,Subtitle,,0,0,0,,Then that would be something we can use.\n" +
"Dialogue: 0,0:22:04.46,0:22:08.58,Subtitle,,0,0,0,,If he faints every time he uses his healing,\\Nhe's worthless to us.\n" +
"Dialogue: 0,0:22:09.17,0:22:12.33,Subtitle,,0,0,0,,Use whatever you must,\\Nwhether a drug or brainwashing.\n" +
"Dialogue: 0,0:22:12.33,0:22:16.38,Subtitle,,0,0,0,,Make it so he is useful to us,\\Nso he can heal in battle.\n" +
"Dialogue: 0,0:22:16.38,0:22:19.75,Subtitle,,0,0,0,,Make it happen, even if it destroys him.\n" +
"Dialogue: 0,0:22:20.38,0:22:24.54,Subtitle,,0,0,0,,After healing just once,\\NFlare has already abandoned me...\n" +
"Dialogue: 0,0:22:25.00,0:22:26.54,Subtitle,,0,0,0,,I completely get it.\n" +
"Dialogue: 0,0:22:26.54,0:22:27.92,Subtitle,,0,0,0,,Honestly.\n" +
"Dialogue: 0,0:22:27.92,0:22:33.83,Subtitle,,0,0,0,,It makes me ill to think that this worthless,\\Nfilthy cur is a hero just as I am.\n" +
"Dialogue: 0,0:22:34.13,0:22:36.46,Subtitle,,0,0,0,,Thank you so much, Flare.\n" +
"Dialogue: 0,0:22:36.46,0:22:40.54,Subtitle,,0,0,0,,I'm so grateful you are the same genuine trash\\Nyou were in my first life.\n" +
"Dialogue: 0,0:22:41.29,0:22:44.92,Subtitle,,0,0,0,,And now... with no hesitation,\\Nand not a shred of mercy,\n" +
"Dialogue: 0,0:22:44.92,0:22:47.79,Subtitle,,0,0,0,,I can have my revenge...\n" +
"Dialogue: 0,0:22:49.71,0:02:54.46,Caption,,0,0,0,,{\\pos(806.4,597.6)}{\\an7}The Healer Starts Over!\n" +
"Dialogue: 0,0:24:19.71,0:24:24.50,Caption-2,,0,0,0,,{\\pos(550.4,180)}{\\an7}Episode 2\n" +
"Dialogue: 0,0:24:19.71,0:24:24.50,Caption-2,,0,0,0,,{\\pos(332.8,482.4)}{\\an7}The Healer Ruins Princess Flare!";
        String[] subArr = subs.split("\n");
        String[] subArrFinal = new String[subArr.length];
        for (int i = 0; i < subArr.length; i++) {
            String lineSub = subArr[i].substring(0, 14);
            String lineSubStartT = subArr[i].substring(14, 22);
            String lineSubMid = subArr[i].substring(22, 25);
            String lineSubEndT = subArr[i].substring(25, 33);
            String lineSubFinal = subArr[i].substring(33);
            
            double startTime = (Double.parseDouble(lineSubStartT.substring(0, 2)) * 60) + (Double.parseDouble(lineSubStartT.substring(3)));
            startTime -= 42.42;
            
            String startTimeF = reFormat(startTime);
            int numMins = ((int) Double.parseDouble(startTimeF)) / 60;
            double numSecs = Double.parseDouble(startTimeF) - (numMins * 60);
            String seconds = reFormat(numSecs);
            while (seconds.length() < 5) {
                seconds = "0" + seconds;
            }
            startTimeF = "" + numMins + ":" + seconds;
            
            lineSub += startTimeF + lineSubMid;
            
            double endTime = (Double.parseDouble(lineSubEndT.substring(0, 2)) * 60) + (Double.parseDouble(lineSubEndT.substring(3)));
            endTime -= 42.17;
            
            String endTimeF = reFormat(endTime);
            numMins = ((int) Double.parseDouble(endTimeF)) / 60;
            numSecs = Double.parseDouble(endTimeF) - (numMins * 60);
            seconds = reFormat(numSecs);
            while (seconds.length() < 5) {
                seconds = "0" + seconds;
            }
            endTimeF = "" + numMins + ":" + seconds;
            
            lineSub += endTimeF + lineSubFinal;
            
            subArr[i] = lineSub;
            System.out.println(subArr[i]);
        }
    }
    
    public static String reFormat(double num) {
        String doubleString = "" + num;
        if (doubleString.charAt(doubleString.length() - 1) == '.') {
                doubleString += "00";
        }
        if (doubleString.charAt(doubleString.length() - 2) == '.') {
            doubleString += "0";
        }
        while (doubleString.charAt(doubleString.length() - 3) != '.') {
            doubleString = doubleString.substring(0, doubleString.length() - 1);
        }
        return doubleString;
    }
    
}
