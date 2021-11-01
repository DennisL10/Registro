package com.dennis.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var et_Nombre: EditText
    private lateinit var et_Apellido:EditText
    private lateinit var rb_Masculino:RadioButton
    private lateinit var rb_Femenino: RadioButton
    private lateinit var rb_Sexo:RadioGroup
    private lateinit var et_Telefono:EditText
    private lateinit var sp_Depart: Spinner
    private lateinit var sp_Muni:Spinner
    private lateinit var tv_Rgistro:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_Nombre = findViewById(R.id.et_Nombre)
        et_Apellido = findViewById(R.id.et_Apellido)
        rb_Masculino = findViewById(R.id.rb_Masculino)
        rb_Femenino = findViewById(R.id.rb_Femenino)
        et_Telefono = findViewById(R.id.et_Telefono)
        sp_Depart = findViewById(R.id.sp_Depart)
        sp_Muni = findViewById(R.id.sp_Muni)
        tv_Rgistro = findViewById(R.id.tv_Registro)
        rb_Sexo = findViewById(R.id.rb_Sexo)

        val Departamentos = arrayOf("Departamento...","Chalatenango", "Santa Ana", "Ahuachapán", "Sonsonate", "San Salvador", "La Libertad", "Cuscatlán",
            "San Miguel", "Morazán", "San Vicente", "Usulután", "Cabañas", "La Paz", "La Unión")
        var Dep = ArrayAdapter(this, android.R.layout.simple_spinner_item, Departamentos)
        sp_Depart.adapter = Dep

        fun Municipios(depart:String):ArrayList<String>{

            var Municipios = arrayListOf<String>()

            when(depart){
                "Chalatenango"->Municipios.addAll(listOf("Seleccione una opcion","Santa Rita", "Agua Caliente","Arcatao","Azacualpa","Chalatenango",
                    "Citalá","Comalapa","Concepción Quezaltepeque",
                    "Dulce Nombre de María","El Carrizal","El Paraíso","La Laguna","La Palma","La Reina",
                    "Las Vueltas","Nombre de Jesús","Nueva Concepción",
                    "Nueva Trinidad","Ojos de Agua","Potonico"))

                "San Salvador"->Municipios.addAll(listOf("Seleccione una opcion","Aguilares","Apopa","Ayutuxtepeque","Ciuddad Delgado",
                    "Cuscatancingo","El Paisnal","Guazapa","Ilopango",
                    "Mejicanos","Nejapa","Panchimalco","Rosario de Mora","San Marcos","San Martín","San Salvador",
                    "Santiago Texacuangos","Santo Tomás",
                    "Soyapango","Tonacatepeque"))

                "Sonsonate"->Municipios.addAll(listOf("Seleccione una opcion","Acajutla","Armenia","Caluco","Cuisnahuat","Izalco",
                    "Juayúa","Nahuizalco","Nahulingo","Salcoatitán",
                    "San Antonio del Monte","San Julián","Santa Catarina Masahuat","Santa Isabel Ishuatán",
                    "Santo Domingo de Guzmán","Sonsonate",
                    "Sonzacate"))

                "La Paz"->Municipios.addAll(listOf("Seleccione una opcion","Cuyultitán","El Rosario (Rosario de La Paz)","Jerusalén",
                    "Mercedes La Ceiba","Olocuilta","Paraíso de Osorio",
                    "San Antonio Masahuat","San Emigdio","San Francisco Chinameca","San Juan Nonualco","San Juan Talpa","San Juan Tepezontes",
                    "San Luis La Herradura","San Luis Talpa","San Miguel Tepezontes",
                    "San Pedro Masahuat","San Pedro Nonualco","San Rafael Obrajuelo"))

                "La Libertad"->Municipios.addAll(listOf("Seleccione una opcion","Antiguo Cuscatlán","Chiltiupán","Ciudad Arce","Colón",
                    "Comasagua","Huizúcar","Jayaque","Jicalapa",
                    "La Libertad","Santa Tecla (Nueva San Salvador)","Nuevo Cuscatlán","San Juan Opico",
                    "Quezaltepeque","Sacacoyo",
                    "San José Villanueva","San Matías","San Pablo Tacachico","Talnique","Tamanique",
                    "Teotepeque","Tepecoyo","Zaragoza"))

                "La Unión"->Municipios.addAll(listOf("Seleccione una opcion","Anamorós","Bolívar","Concepción de Oriente","Conchagua",
                    "El Carmen","El Sauce","Intipucá","La Unión","Lilisque",
                    "Meanguera del Golfo","Nueva Esparta","Pasaquina","Polorós","San Alejo","San José","Santa Rosa de Lima","Yayantique","Yucuaiquín"))

                "Morazán"->Municipios.addAll(listOf("Seleccione una opcion","Arambala","Cacaopera","Chilanga","Corinto",
                    "Delicias de Concepción","El Divisadero","El Rosario","Gualococti",
                    "Guatajiagua","Joateca","Jocoaitique","Jocoro","Lolotiquillo","Meanguera","Osicala","Perquín","San Carlos","San Fernando",
                    "San Francisco Gotera","San Isidro","San Simón","Sensembra","Sociedad","Torola","Yamabal","Yoloaiquín"))

                "Cuscatlán"->Municipios.addAll(listOf("Seleccione una opcion","Candelaria","Cojutepeque","El Carmen","El Rosario","Monte San Juan","Oratorio de Concepción","San Bartolomé Perulapía",
                    "San Cristóbal","San José Guayabal","San Pedro Perulapán","San Rafael Cedros","San Ramón","Santa Cruz Analquito","Santa Cruz Michapa",
                    "Suchitoto","Tenancingo"))

                "Ahuachapán"->Municipios.addAll(listOf("Seleccione una opcion","Ahuachapán","Apaneca","Atiquizaya","Concepción de Ataco","El Refugio","Guaymango","Jujutla",
                    "San Francisco Menéndez","San Lorenzo","San Pedro Puxtla","Tacuba","Turín"))

                "San Miguel"->Municipios.addAll(listOf("Seleccione una opcion","Carolina","Chapeltique","Chinameca","Chirilagua",
                    "Ciudad Barrios","Comacarán","El Tránsito","Lolotique",
                    "Moncagua","Nueva Guadalupe","Nuevo Edén de San Juan","Quelepa","San Antonio del Mosco","San Gerardo","San Jorge",
                    "San Luis de la Reina","San Miguel","San Rafael Oriente","Sesori","Uluazapa"))

                "Usulután"->Municipios.addAll(listOf("Seleccione una opcion","Alegría","Berlín","California","Concepción Batres",
                    "El Triunfo","Ereguayquín","Estanzuelas","Jiquilisco",
                    "Jucuapa","Jucuarán","Mercedes Umaña","Nueva Granada","Ozatlán","Puerto El Triunfo","San Agustín","San Buenaventura",
                    "San Dionisio","San Francisco Javier","Santa Elena","Santa María","Santiago de María","Tecapán","Usulután"))

                "Cabañas"->Municipios.addAll(listOf("Seleccione una opcion","Cinquera","Dolores (Villa Doleres)","Guacotecti","Ilobasco","Jutiapa","San Isidro",
                    "Sensuntepeque","Tejutepeque","Victoria"))

                "Santa Ana"->Municipios.addAll(listOf("Seleccione una opcion","Candelaria de la Frontera","Chalchuapa","Coatepeque","El Congo","El Porvenir","Masahuat","Metapán",
                    "San Antonio Pajonal","San Sebastián Salitrillo","Santa Ana","Santa Rosa Guachipilín","Santiago de la Frontera","Texistepeque"))

                "San Vicente"->Municipios.addAll(listOf("Seleccione una opcion","Apastepeque","Guadalupe","San Cayetano Istepeque","San Esteban Catarina","San Ildefonso","San Lorenzo",
                    "San Sebastián","San Vicente","Santa Clara","Santo Domingo","Tecoluca","Tepetitán","Verapaz"))


            }

            return Municipios
        }
        sp_Depart?.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                var department:String=sp_Depart.selectedItem.toString()
                val datosSpinerMunicipios = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, Municipios(department))
                sp_Muni.adapter = datosSpinerMunicipios
            }
        }
    }

    fun ClearText(){
        et_Nombre.setText("")
        et_Apellido.setText("")
        sp_Depart.setSelection(0)
        sp_Muni.setSelection(0)
        et_Telefono.setText("").toString()
        rb_Masculino.isSelected = false
        rb_Sexo.isSelected = false
        rb_Femenino.isSelected = false
    }

    var Info = arrayListOf<Array<String>>()

    fun Guardar(Save:View){

        var Nombre = et_Nombre.text.toString()
        var Apellido = et_Apellido.text.toString()
        var Telefono = et_Telefono.text.toString()
        var Depart=sp_Depart.selectedItem.toString()
        var Muni=sp_Muni.selectedItem.toString()

        var Sexo = ""
        if(rb_Masculino.isChecked){
            Sexo = "Masculino"
        }
        else if(rb_Femenino.isChecked){
            Sexo = "Femenino"
        }

            Info.clear()
            Info.addAll(listOf(arrayOf(Nombre, Apellido, Telefono, Sexo, Depart, Muni)))
            Toast.makeText(this, "Registrando...", Toast.LENGTH_SHORT).show()

        ClearText()


    }


    fun Mostrar(Show:View){
        if (Info.size == 0){
            Toast.makeText(this,"Ingresa tus datos para mostrar ", Toast.LENGTH_LONG).show()
        }else {
            for (i in 0..Info.size - 1) {
                tv_Rgistro.append(
                    "Nombre: " + Info[i].get(0).toString() + "\n" +
                            "Apellido: " + Info[i].get(1).toString() + "\n" +
                            "Numero: " + Info[i].get(2).toString() + "\n" +
                            "Sexo: " + Info[i].get(3).toString() + "\n" +
                            "Departamento: " + Info[i].get(4).toString() + "\n" +
                            "Municipio: " + Info[i].get(5).toString() + "\n" + "\n" +
                            "GRACIAS!!")
            }
        }

        ClearText()
    }
    fun ClearView(Show: View){
        tv_Rgistro.setText("")

    }

}