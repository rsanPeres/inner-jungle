package com.research.innerjungle.domain.factory

import com.research.innerjungle.domain.entity.*
import com.research.innerjungle.domain.enum.TypeMicroorganism

object MicroorganismFactory {
    fun createMicroorganism(microorganism : MicroorganismBase) : MicroorganismBase{
        return when(microorganism.type){
            TypeMicroorganism.FUNGUS -> Fungus(microorganism.name, microorganism.brand, microorganism.storageTemperature, microorganism.arrival, microorganism.type, microorganism.family, microorganism.genus, microorganism.species, microorganism.virulence, microorganism.pathogenicity)
            TypeMicroorganism.SEAWEED -> Seaweed(microorganism.name, microorganism.brand, microorganism.storageTemperature, microorganism.arrival, microorganism.type, microorganism.family, microorganism.genus, microorganism.species, microorganism.virulence, microorganism.pathogenicity)
            TypeMicroorganism.VIRUS -> Virus(microorganism.name, microorganism.brand, microorganism.storageTemperature, microorganism.arrival, microorganism.type, microorganism.family, microorganism.genus, microorganism.species, microorganism.virulence, microorganism.pathogenicity)
            TypeMicroorganism.BACTERIUM -> Bacterium(microorganism.name, microorganism.brand, microorganism.storageTemperature, microorganism.arrival, microorganism.type, microorganism.family, microorganism.genus, microorganism.species, microorganism.virulence, microorganism.pathogenicity)
            TypeMicroorganism.PROTOZOAN -> Protozoan(microorganism.name, microorganism.brand, microorganism.storageTemperature, microorganism.arrival, microorganism.type, microorganism.family, microorganism.genus, microorganism.species, microorganism.virulence, microorganism.pathogenicity)
            else -> microorganism
        }
    }
}