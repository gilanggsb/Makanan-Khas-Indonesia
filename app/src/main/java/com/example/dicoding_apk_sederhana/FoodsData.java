package com.example.dicoding_apk_sederhana;

import java.util.ArrayList;

public class FoodsData {
    private static String[] foodNames = {
            "Empal Gentong",
            "Rendang",
            "Sate",
            "Nasi Goreng",
            "Bakso",
            "Soto",
            "Rawon",
            "Gado-Gado",
            "Nasi Padang",
            "Pempek",
    };

    private static String[] foodDetails = {
            "Empal gentong merupakan masakan tradisional yang sudah eksis sejak 1994, isinya terdiri dari usus, babat, dan irisan daging sapi direbus dalam kuah kuning dengan taburan daun kucai.",

            "Siapa yang tidak tahu makanan khas dari Sumatera Barat yang satu ini. Irisan daging sapi yang dimasak dengan rempah khas padang yang gurih.  Ada dua proses pemasakan daging sapi yang kaya akan rempah ini. Untuk memasang rendang, dibutuhkan waktu minimal 4 jam untuk menjadikan daging rendang berwarna hitam pekat dan bumbu mengering seperti dedak.",

            "Sate juga salah satu makanan yang mudah untuk dijumpai di Indonesia. Sate adalah kuliner khas Indonesia yang menggunakan daging ayam, sapi, kambing, kelinci, ataupun kerbau sebagai bahan bakunya.",

            "Biasanya nasi goreng sering dihidangkan untuk sarapan atau kuliner di malam hari. Untuk Grameds yang sering berburu kuliner di malam hari, Grameds bisa mendapati nasi goreng gerobak yang harum baunya  tak kuasa untuk ditolak. Tak salah jika nasi goreng menjadi kuliner yang juga dinobatkan sebagai makanan terlezat di dunia.",

            "Bakso merupakan olahan dari daging sapi yang dihaluskan, dicampur dengan bumbu halus, tepung terigu, dan penyedap rasa. Adonan tersebut dibentuk bola lalu direbus hingga matang.  Bakso disajikan bersama kuah kaldu sapi beserta pelengkap berupa mie kuning, bihun, tahu bakso, dan rajangan daun seledri.",

            "Soto, Coto, Sauto, Tauto adalah makanan khas Indonesia sejenis sup dengan kuah rebusan ayam atau sapi. Soto biasanya memakai dua jenis daging, yakni daging ayam dan dan daging sapi.  Soto ayam memiliki kuah berwarna kekuningan dengan rasa gurih dan harum. Warna kuning dikarenakan dari kunyit, bawang merah, bawang putih sebagai bumbu dasarnya. Sedangkan soto daging biasa berwarna bening atau berkuah santan.",

            "Rawon adalah makan khas dari Kota Surabaya yang mirip dengan sup daging namun memiliki kuah hitam pekat. Meskipun kuahnya tidak seperti sup pada umumnya, rawon memiliki cita rasa yang khas dan selalu dirindukan oleh penikmat masakan Jawa timuran.",

            "Gado-gado adalah makanan khas dari Jakarta yang menyehatkan karena terdiri dari rebusan sayuran seperti kangkung, wortel, labu siam, selada, timun dan irisan tempe yang disiram dengan saus kacang yang gurih.",

            "Siapa yang tidak tergoda menyantap Nasi Padang saat makan siang? Baru mendengar namanya saja sudah menerbitkan air liur ya Grameds. Nasi Padang sebenarnya adalah nasi putih yang disajikan bersama aneka jenis lauk khas Padang seperti rendang, gulai ikan, ayam bakar, ayam pop, telor dadar, kering tempe, daging cincang, daun singkong rebus dan sambal ijo.",

            "Pempek merupakan kuliner khas Sumatra yang terbuat dari ikan tenggiri, toman, atau gabus yang dihaluskan, dicampur bersama tepung sagu dan bumbu halus. Pempek diuleni hingga kalis lalu direbus dalam air mendidih. setelah itu pempek digoreng dan disantap bersama kuah cuko. Kuah cuko adalah kuah yang terbuat dari rebusan gula merah dan cuka.",
    };

    private static int[] foodImages = {
            R.drawable.empal_gentong,
            R.drawable.rendang,
            R.drawable.sate,
            R.drawable.nasi_goreng,
            R.drawable.bakso,
            R.drawable.soto,
            R.drawable.rawon,
            R.drawable.gado_gado,
            R.drawable.nasi_padang,
            R.drawable.pempek,
    };

    static ArrayList<Food> getListFood() {
        ArrayList<Food> listFood = new ArrayList<Food>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            listFood.add(food);
        }
        return listFood;
    }

}
