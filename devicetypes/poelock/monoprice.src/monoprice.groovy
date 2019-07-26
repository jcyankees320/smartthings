preferences {
	section("Internal Access"){
		input "source1name", "text", title: "Source 1 Name", required: true    
	}
}

metadata {
	definition (name: "Monoprice", namespace: "poelock", author: "poelock") {
    capability "Actuator"
    capability "Music Player"
    capability "Switch"
    capability "Switch Level"
    capability "Refresh"
    capability "Polling"
    capability "Sensor"
    command "alloff"
	command "allon"
	command "zone1on"
    command "zone2on"
	command "zone3on"
    command "zone4on"
	command "zone5on"
    command "zone6on"
    command "zone1off"
    command "zone2off"
    command "zone3off"
    command "zone4off"
    command "zone5off"
    command "zone6off"    
    command "zone1vol"
    command "zone2vol"
    command "zone3vol"
    command "zone4vol"
    command "zone5vol"
	command "zone6vol"
	command "zone1bass"
	command "zone2bass"
	command "zone3bass"
	command "zone4bass"
	command "zone5bass"
	command "zone6bass"
	command "zone1treb"
	command "zone2treb"
	command "zone3treb"
	command "zone4treb"
	command "zone5treb"
	command "zone6treb"
	command "zone1source1"
	command "zone2source1"
	command "zone3source1"
	command "zone4source1"
	command "zone5source1"
	command "zone6source1"
	command "zone1source2"
	command "zone2source2"
    command "zone3source2"
    command "zone4source2"
    command "zone5source2"
    command "zone6source2"
	command "zone1source3"
	command "zone2source3"
	command "zone3source3"
	command "zone4source3"
	command "zone5source3"
	command "zone6source3"
	command "zone1source4"
	command "zone2source4"
    command "zone3source4"
    command "zone4source4"
    command "zone5source4"
    command "zone6source4"
	command "zone1source5"
	command "zone2source5"
	command "zone3source5"
	command "zone4source5"
	command "zone5source5"
	command "zone6source5"
	command "zone1source6"
	command "zone2source6"
    command "zone3source6"
    command "zone4source6"
    command "zone5source6"
    command "zone6source6"
	}

  tiles(scale: 2)  {
//row 0
		standardTile("icon", "icon", width: 1, height: 1, canChangeIcon: false, inactiveLabel: true, canChangeBackground: false) {
			state "default", label: "Monoprice", action: "", icon: "st.Electronics.electronicsource16", backgroundColor: "#FFFFFF"
		}  
//All On/Off       
  		standardTile("alloff", "device.switch", decoration: "flat", width: 3, height: 1) {
      	state "off", label: "All Off", action:"alloff", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff"
      	}
  		standardTile("allon", "device.switch", decoration: "flat", width: 3, height: 1)  {
      	state "off", label: "All On", action:"allon", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff" 
      	}
//Zone 1
  		standardTile("zone1", "device.switch", decoration: "flat", width:3, height:2, canChangeIcon: true) {
        state "on", label: "ZONE1NAME", action:"zone1off", icon:"st.switches.switch.on", backgroundColor:"#00a0dc", nextState:"off"
        state "off", label: "ZONE1NAME", action:"zone1on", icon:"st.switches.switch.off", backgroundColor:"#ffffff", nextState:"on"
      	}
        standardTile("zone1vollabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", label: "Volume"
    	}
        controlTile("zone1vol", "device.level", "slider", height: 1, width: 1, range:"(0..38)") {
      	state "zone1vol", label: '${currentValue}', action:"zone1vol"
    	}
        standardTile("zone1basslabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/bass.png"
    	}
    	controlTile("zone1bass", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
      	state "zone1bass", label: '${currentValue}', action:"zone1bass"
    	}
        standardTile("zone1treblabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/treble.png"
      	}
        controlTile("zone1treb", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
        state "zone1treb", label: '${currentValue}', action:"zone1treb"
        }
      	standardTile("z1s1", "device.zone1source1", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE1NAME", action:"zone1source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
   	   	state("on", label:"SOURECE1NAME", action:"zone1source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z1s2", "device.zone1source2", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE2NAME", action:"zone1source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE2NAME", action:"zone1source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
       	standardTile("z1s3", "device.zone1source3", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE3NAME", action:"zone1source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE3NAME", action:"zone1source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z1s4", "device.zone1source4", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE4NAME", action:"zone1source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE4NAME", action:"zone1source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z1s5", "device.zone1source5", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE5NAME", action:"zone1source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE5NAME", action:"zone1source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z1s6", "device.zone1source6", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE6NAME", action:"zone1source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE6NAME", action:"zone1source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }

//Zone 2 
  		standardTile("zone2", "device.switch", decoration: "flat", width:3, height:2, canChangeIcon: true) {
        state "on", label: "ZONE2NAME", action:"zone2off", icon:"st.switches.switch.on", backgroundColor:"#00a0dc", nextState:"off"
        state "off", label: "ZONE2NAME", action:"zone2on", icon:"st.switches.switch.off", backgroundColor:"#ffffff", nextState:"on"
      	}
        standardTile("zone2vollabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", label: "Volume"
    	}
        controlTile("zone2vol", "device.level", "slider", height: 1, width: 1, range:"(0..38)") {
      	state "zone2vol", label: '${currentValue}', action:"zone2vol"
    	}
        standardTile("zone2basslabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/bass.png"
    	}
    	controlTile("zone2bass", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
      	state "zone2bass", label: '${currentValue}', action:"zone2bass"
    	}
        standardTile("zone2treblabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/treble.png"
      	}
        controlTile("zone2treb", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
        state "zone2treb", label: '${currentValue}', action:"zone2treb"
        }
      	standardTile("z2s1", "device.zone2source1", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE1NAME", action:"zone2source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
   	   	state("on", label:"SOURCE1NAME", action:"zone2source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z2s2", "device.zone2source2", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE2NAME", action:"zone2source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE2NAME", action:"zone2source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
       	standardTile("z2s3", "device.zone2source3", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE3NAME", action:"zone2source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE3NAME", action:"zone2source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z2s4", "device.zone2source4", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE4NAME", action:"zone2source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE4NAME", action:"zone2source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z2s5", "device.zone2source5", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE5NAME", action:"zone2source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE5NAME", action:"zone2source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z2s6", "device.zone2source6", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE6NAME", action:"zone2source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE6NAME", action:"zone2source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
        
        
//Zone 3 
  		standardTile("zone3", "device.switch", decoration: "flat", width:3, height:2, canChangeIcon: true) {
        state "on", label: "ZONE3NAME", action:"zone3off", icon:"st.switches.switch.on", backgroundColor:"#00a0dc", nextState:"off"
        state "off", label: "ZONE3NAME", action:"zone3on", icon:"st.switches.switch.off", backgroundColor:"#ffffff", nextState:"on"
      	}
        standardTile("zone3vollabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", label: "Volume"
    	}
        controlTile("zone3vol", "device.level", "slider", height: 1, width: 1, range:"(0..38)") {
      	state "zone3vol", label: '${currentValue}', action:"zone3vol"
    	}
        standardTile("zone3basslabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/bass.png"
    	}
    	controlTile("zone3bass", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
      	state "zone3bass", label: '${currentValue}', action:"zone3bass"
    	}
        standardTile("zone3treblabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/treble.png"
      	}
        controlTile("zone3treb", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
        state "zone3treb", label: '${currentValue}', action:"zone3treb"
        }    
      	standardTile("z3s1", "device.zone3source1", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE1NAME", action:"zone3source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
   	   	state("on", label:"SOURCE1NAME", action:"zone3source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z3s2", "device.zone3source2", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE2NAME", action:"zone3source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE2NAME", action:"zone3source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
       	standardTile("z3s3", "device.zone3source3", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE3NAME", action:"zone3source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE3NAME", action:"zone3source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z3s4", "device.zone3source4", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE4NAME", action:"zone3source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE4NAME", action:"zone3source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z3s5", "device.zone3source5", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE5NAME", action:"zone3source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE5NAME", action:"zone3source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z3s6", "device.zone3source6", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE6NAME", action:"zone3source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE6NAME", action:"zone3source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }   
// Zone 4
  		standardTile("zone4", "device.switch", decoration: "flat", width:3, height:2, canChangeIcon: true) {
        state "on", label: "ZONE4NAME", action:"zone4off", icon:"st.switches.switch.on", backgroundColor:"#00a0dc", nextState:"off"
        state "off", label: "ZONE4NAME", action:"zone4on", icon:"st.switches.switch.off", backgroundColor:"#ffffff", nextState:"on"
      	}
        standardTile("zone4vollabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", label: "Volume"
    	}
        controlTile("zone4vol", "device.level", "slider", height: 1, width: 1, range:"(0..38)") {
      	state "zone4vol", label: '${currentValue}', action:"zone4vol"
    	}
        standardTile("zone4basslabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/bass.png"
    	}
    	controlTile("zone4bass", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
      	state "zone4bass", label: '${currentValue}', action:"zone4bass"
    	}
        standardTile("zone4treblabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/treble.png"
      	}
        controlTile("zone4treb", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
        state "zone4treb", label: '${currentValue}', action:"zone4treb"
        }    
      	standardTile("z4s1", "device.zone4source1", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE1NAME", action:"zone4source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
   	   	state("on", label:"SOURCE1NAME", action:"zone4source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z4s2", "device.zone4source2", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE2NAME", action:"zone4source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE2NAME", action:"zone4source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
       	standardTile("z4s3", "device.zone4source3", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE3NAME", action:"zone4source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE3NAME", action:"zone4source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z4s4", "device.zone4source4", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE4NAME", action:"zone4source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE4NAME", action:"zone4source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z4s5", "device.zone4source5", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE5NAME", action:"zone4source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE5NAME", action:"zone4source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z4s6", "device.zone4source6", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE6NAME", action:"zone4source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE6NAME", action:"zone4source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }   
// Zone 5
  		standardTile("zone5", "device.switch", decoration: "flat", width:3, height:2, canChangeIcon: true) {
        state "on", label: "ZONE5NAME", action:"zone5off", icon:"st.switches.switch.on", backgroundColor:"#00a0dc", nextState:"off"
        state "off", label: "ZONE5NAME", action:"zone5on", icon:"st.switches.switch.off", backgroundColor:"#ffffff", nextState:"on"
      	}
        standardTile("zone5vollabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", label: "Volume"
    	}
        controlTile("zone5vol", "device.level", "slider", height: 1, width: 1, range:"(0..38)") {
      	state "zone5vol", label: '${currentValue}', action:"zone5vol"
    	}
        standardTile("zone5basslabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/bass.png"
    	}
    	controlTile("zone5bass", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
      	state "zone5bass", label: '${currentValue}', action:"zone5bass"
    	}
        standardTile("zone5treblabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/treble.png"
      	}
        controlTile("zone5treb", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
        state "zone5treb", label: '${currentValue}', action:"zone5treb"
        }    
      	standardTile("z5s1", "device.zone5source1", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE1NAME", action:"zone5source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
   	   	state("on", label:"SOURCE1NAME", action:"zone5source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z5s2", "device.zone5source2", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE2NAME", action:"zone5source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE2NAME", action:"zone5source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
       	standardTile("z5s3", "device.zone5source3", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE3NAME", action:"zone5source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE3NAME", action:"zone5source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z5s4", "device.zone5source4", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE4NAME", action:"zone5source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE4NAME", action:"zone5source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z5s5", "device.zone5source5", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE5NAME", action:"zone5source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE5NAME", action:"zone5source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z5s6", "device.zone5source6", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE6NAME", action:"zone5source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE6NAME", action:"zone5source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
  		}   
// Zone 6
  		standardTile("zone6", "device.switch", decoration: "flat", width:3, height:2, canChangeIcon: true) {
        state "on", label: "ZONE6NAME", action:"zone6off", icon:"st.switches.switch.on", backgroundColor:"#00a0dc", nextState:"off"
        state "off", label: "ZONE6NAME", action:"zone6on", icon:"st.switches.switch.off", backgroundColor:"#ffffff", nextState:"on"
      	}
        standardTile("zone6vollabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", label: "Volume"
    	}
        controlTile("zone6vol", "device.level", "slider", height: 1, width: 1, range:"(0..38)") {
      	state "zone6vol", label: '${currentValue}', action:"zone6vol"
    	}
        standardTile("zone6basslabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/bass.png"
    	}
    	controlTile("zone6bass", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
      	state "zone6bass", label: '${currentValue}', action:"zone6bass"
    	}
        standardTile("zone6treblabel", "default", decoration: "flat", height: 1, width: 1) {
      	state "default", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/treble.png"
      	}
        controlTile("zone6treb", "device.level", "slider", height: 1, width: 1, range:"(0..14)") {
        state "zone6treb", label: '${currentValue}', action:"zone6treb"
        }    
      	standardTile("z6s1", "device.zone6source1", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE1NAME", action:"zone6source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
   	   	state("on", label:"SOURCE1NAME", action:"zone6source1", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z6s2", "device.zone6source2", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE2NAME", action:"zone6source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE2NAME", action:"zone6source2", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
       	standardTile("z6s3", "device.zone6source3", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE3NAME", action:"zone6source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE3NAME", action:"zone6source3", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z6s4", "device.zone6source4", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE4NAME", action:"zone6source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE4NAME", action:"zone6source4", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z6s5", "device.zone6source5", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE5NAME", action:"zone6source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE5NAME", action:"zone6source5", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }
    	standardTile("z6s6", "device.zone6source6", decoration: "flat", width: 2, height: 2) {
      	state("off", label:"SOURCE6NAME", action:"zone6source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-gray.png", backgroundColor:"#ffffff")
      	state("on", label:"SOURCE6NAME", action:"zone6source6", icon:"https://raw.githubusercontent.com/redloro/smartthings/master/images/indicator-dot-green.png", backgroundColor:"#ffffff")
    }   

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    main(["icon"])
    details(["alloff", "allon","zone1","zone1vollabel","zone1basslabel","zone1treblabel","zone1vol","zone1bass","zone1treb","z1s1","z1s2","z1s3","z1s4","z1s5","z1s6","zone2","zone2vollabel","zone2basslabel","zone2treblabel","zone2vol","zone2bass",
    "zone2treb","z2s1","z2s2","z2s3","z2s4","z2s5","z2s6","zone3","zone3vollabel","zone3basslabel","zone3treblabel","zone3vol","zone3bass","zone3treb","z3s1","z3s2","z3s3","z3s4","z3s5","z3s6","zone4","zone4vollabel","zone4basslabel","zone4treblabel",
    "zone4vol","zone4bass","zone4treb","z4s1","z4s2","z4s3","z4s4","z4s5","z4s6","zone5","zone5vollabel","zone5basslabel","zone5treblabel","zone5vol","zone5bass","zone5treb","z5s1","z5s2","z5s3","z5s4","z5s5","z5s6",
    "zone6","zone6vollabel","zone6basslabel","zone6treblabel","zone6vol","zone6bass","zone6treb","z6s1","z6s2","z6s3","z6s4","z6s5","z6s6"])
}    
}
def parse(String description) {
	log.debug(description)
}
def HostAddress() {return "C0A80028:1387"}
def pwron() {return "PR01"}
def pwroff() {return "PR00"}
def allzoneunit1() {return "10"}
def allzoneunit2() {return "20"}
def allzoneunit3() {return "30"}
def zone1() {return "11"}
def zone2() {return "12"}
def zone3() {return "13"}
def zone4() {return "14"}
def zone5() {return "15"}
def zone6() {return "16"}
def source1() {return "01"}
def source2() {return "02"}
def source3() {return "03"}
def source4() {return "04"}
def source5() {return "05"}
def source6() {return "06"}
def volcontrol() {return "VO"}
def basscontrol() {return "BS"}
def trebcontrol() {return "TR"}
def sourcecontrol() {return "CH"}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone1source1() {
def command = "<" + zone1() + sourcecontrol() + source1()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone1source${i}", value: "off")
}
sendEvent(name: "zone1source1", value: "on")
}
def zone1source2() {
def command = "<" + zone1() + sourcecontrol() + source2()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone1source${i}", value: "off")
}
sendEvent(name: "zone1source2", value: "on")
}
def zone1source3() {
def command = "<" + zone1() + sourcecontrol() + source3()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone1source${i}", value: "off")
}
sendEvent(name: "zone1source3", value: "on") 
}
def zone1source4() {
def command = "<" + zone1() + sourcecontrol() + source4()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone1source${i}", value: "off")
}
sendEvent(name: "zone1source4", value: "on") 
}
def zone1source5() {
def command = "<" + zone1() + sourcecontrol() + source5()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone1source${i}", value: "off")
}
sendEvent(name: "zone1source5", value: "on") 
}
def zone1source6() {
def command = "<" + zone1() + sourcecontrol() + source6()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone1source${i}", value: "off")
}
sendEvent(name: "zone1source6", value: "on") 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone2source1() {
def command = "<" + zone2() + sourcecontrol() + source1()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone2source${i}", value: "off")
}
sendEvent(name: "zone2source1", value: "on")
}
def zone2source2() {
def command = "<" + zone2() + sourcecontrol() + source2()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone2source${i}", value: "off")
}
sendEvent(name: "zone2source2", value: "on")
}
def zone2source3() {
def command = "<" + zone2() + sourcecontrol() + source3()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone2source${i}", value: "off")
}
sendEvent(name: "zone2source3", value: "on") 
}
def zone2source4() {
def command = "<" + zone2() + sourcecontrol() + source4()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone2source${i}", value: "off")
}
sendEvent(name: "zone2source4", value: "on") 
}
def zone2source5() {
def command = "<" + zone2() + sourcecontrol() + source5()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone2source${i}", value: "off")
}
sendEvent(name: "zone2source5", value: "on") 
}
def zone2source6() {
def command = "<" + zone2() + sourcecontrol() + source6()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone2source${i}", value: "off")
}
sendEvent(name: "zone2source6", value: "on") 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone3source1() {
def command = "<" + zone3() + sourcecontrol() + source1()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone3source${i}", value: "off")
}
sendEvent(name: "zone3source1", value: "on")
}
def zone3source2() {
def command = "<" + zone3() + sourcecontrol() + source2()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone3source${i}", value: "off")
}
sendEvent(name: "zone3source2", value: "on")
}
def zone3source3() {
def command = "<" + zone3() + sourcecontrol() + source3()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone3source${i}", value: "off")
}
sendEvent(name: "zone3source3", value: "on") 
}
def zone3source4() {
def command = "<" + zone3() + sourcecontrol() + source4()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone3source${i}", value: "off")
}
sendEvent(name: "zone3source4", value: "on") 
}
def zone3source5() {
def command = "<" + zone3() + sourcecontrol() + source5()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone3source${i}", value: "off")
}
sendEvent(name: "zone3source5", value: "on") 
}
def zone3source6() {
def command = "<" + zone3() + sourcecontrol() + source6()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone3source${i}", value: "off")
}
sendEvent(name: "zone3source6", value: "on") 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone4source1() {
def command = "<" + zone4() + sourcecontrol() + source1()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone4source${i}", value: "off")
}
sendEvent(name: "zone4source1", value: "on")
}
def zone4source2() {
def command = "<" + zone4() + sourcecontrol() + source2()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone4source${i}", value: "off")
}
sendEvent(name: "zone4source2", value: "on")
}
def zone4source3() {
def command = "<" + zone4() + sourcecontrol() + source3()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone4source${i}", value: "off")
}
sendEvent(name: "zone4source3", value: "on") 
}
def zone4source4() {
def command = "<" + zone4() + sourcecontrol() + source4()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone4source${i}", value: "off")
}
sendEvent(name: "zone4source4", value: "on") 
}
def zone4source5() {
def command = "<" + zone4() + sourcecontrol() + source5()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone4source${i}", value: "off")
}
sendEvent(name: "zone4source5", value: "on") 
}
def zone4source6() {
def command = "<" + zone4() + sourcecontrol() + source6()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone4source${i}", value: "off")
}
sendEvent(name: "zone4source6", value: "on") 
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone5source1() {
def command = "<" + zone5() + sourcecontrol() + source1()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone5source${i}", value: "off")
}
sendEvent(name: "zone5source1", value: "on")
}
def zone5source2() {
def command = "<" + zone5() + sourcecontrol() + source2()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone5source${i}", value: "off")
}
sendEvent(name: "zone5source2", value: "on")
}
def zone5source3() {
def command = "<" + zone5() + sourcecontrol() + source3()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone5source${i}", value: "off")
}
sendEvent(name: "zone5source3", value: "on") 
}
def zone5source4() {
def command = "<" + zone5() + sourcecontrol() + source4()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone5source${i}", value: "off")
}
sendEvent(name: "zone5source4", value: "on") 
}
def zone5source5() {
def command = "<" + zone5() + sourcecontrol() + source5()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone5source${i}", value: "off")
}
sendEvent(name: "zone5source5", value: "on") 
}
def zone5source6() {
def command = "<" + zone5() + sourcecontrol() + source6()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone5source${i}", value: "off")
}
sendEvent(name: "zone5source6", value: "on") 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone6source1() {
def command = "<" + zone6() + sourcecontrol() + source1()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone6source${i}", value: "off")
}
sendEvent(name: "zone6source1", value: "on")
}
def zone6source2() {
def command = "<" + zone6() + sourcecontrol() + source2()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone6source${i}", value: "off")
}
sendEvent(name: "zone6source2", value: "on")
}
def zone6source3() {
def command = "<" + zone6() + sourcecontrol() + source3()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone6source${i}", value: "off")
}
sendEvent(name: "zone6source3", value: "on") 
}
def zone6source4() {
def command = "<" + zone6() + sourcecontrol() + source4()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone6source${i}", value: "off")
}
sendEvent(name: "zone6source4", value: "on") 
}
def zone6source5() {
def command = "<" + zone6() + sourcecontrol() + source5()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone6source${i}", value: "off")
}
sendEvent(name: "zone6source5", value: "on") 
}
def zone6source6() {
def command = "<" + zone6() + sourcecontrol() + source6()
sendHubCommand(new physicalgraph.device.HubAction("${command}\r\n",physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i = 1; i < 7; i++)
{
	sendEvent(name: "zone6source${i}", value: "off")
}
sendEvent(name: "zone6source6", value: "on") 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def alloff(){
def theCom = "<" + allzoneunit1() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i=1; i<7; i++)
{
	sendEvent(name: "zone${i}", value: "off")
    sendEvent(name: "zone1source${i}", value: "off")
    sendEvent(name: "zone2source${i}", value: "off")
    sendEvent(name: "zone3source${i}", value: "off")
    sendEvent(name: "zone4source${i}", value: "off")
    sendEvent(name: "zone5source${i}", value: "off")
    sendEvent(name: "zone6source${i}", value: "off")
}
}
def allon(){
def theCom = "<" + allzoneunit1() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
for (int i=1; i<7; i++)
{
	sendEvent(name: "zone${i}", value: "on")
}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone1on() {
def theCom = "<" + zone1() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone1", value: "on") 
}
def zone1off() {
def theCom = "<" + zone1() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone1", value: "off") 
}
def zone2on() {
def theCom = "<" + zone2() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone2", value: "on") 
}
def zone2off() {
def theCom = "<" + zone2() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone2", value: "off") 
}
def zone3on() {
def theCom = "<" + zone3() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone3", value: "on") 
}
def zone3off() {
def theCom = "<" + zone3() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone3", value: "off") 
}
def zone4on() {
def theCom = "<" + zone4() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone4", value: "on") 
}
def zone4off() {
def theCom = "<" + zone4() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone4", value: "off") 
}
def zone5on() {
def theCom = "<" + zone5() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone5", value: "on") 
}
def zone5off() {
def theCom = "<" + zone5() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone5", value: "off") 
}
def zone6on() {
def theCom = "<" + zone6() + pwron()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone6", value: "on") 
}
def zone6off() {
def theCom = "<" + zone6() + pwroff()
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone6", value: "off") 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
def zone1vol(level) {
def theCom = "<" + zone1() + volcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone1vol", value: level) 
}
def zone1bass(level) {
def theCom = "<" + zone1() + basscontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone1bass", value: level) 
}
def zone1treb(level) {
def theCom = "<" + zone1() + trebcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone1treb", value: level) 
}
def zone2vol(level) {
def theCom = "<" + zone2() + volcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone2vol", value: level) 
}
def zone2bass(level) {
def theCom = "<" + zone2() + basscontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone2bass", value: level) 
}
def zone2treb(level) {
def theCom = "<" + zone2() + trebcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone2treb", value: level) 
}
def zone3vol(level) {
def theCom = "<" + zone3() + volcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone3vol", value: level) 
}
def zone3bass(level) {
def theCom = "<" + zone3() + basscontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone3bass", value: level) 
}
def zone3treb(level) {
def theCom = "<" + zone3() + trebcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone3treb", value: level) 
}
def zone4vol(level) {
def theCom = "<" + zone4() + volcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone4vol", value: level) 
}
def zone4bass(level) {
def theCom = "<" + zone4() + basscontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone4bass", value: level) 
}
def zone4treb(level) {
def theCom = "<" + zone4() + trebcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone4treb", value: level) 
}
def zone5vol(level) {
def theCom = "<" + zone5() + volcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone5vol", value: level) 
}
def zone5bass(level) {
def theCom = "<" + zone5() + basscontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone5bass", value: level) 
}
def zone5treb(level) {
def theCom = "<" + zone5() + trebcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone5treb", value: level) 
}
def zone6vol(level) {
def theCom = "<" + zone6() + volcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone6vol", value: level) 
}
def zone6bass(level) {
def theCom = "<" + zone6() + basscontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone6bass", value: level) 
}
def zone6treb(level) {
def theCom = "<" + zone6() + trebcontrol() + "${level}"
sendHubCommand(new physicalgraph.device.HubAction("${theCom}\r\n", physicalgraph.device.Protocol.LAN, HostAddress()))
sendEvent(name: "zone6treb", value: level) 
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
