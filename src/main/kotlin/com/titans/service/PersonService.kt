package com.titans.service
//
//import com.titans.dto.Person
//import com.titans.repository.PersonRepository
//import org.springframework.stereotype.Service
//
//@Service
//class PersonService
//(
//    private val personRepository: PersonRepository
//)
//{
//
//    fun savePerson(person: Person):Person{
//        val personModel = com.titans.model.Person(null,person.name,person.region,person.birthday)
//        personRepository.save(personModel)
//        person.id = personModel.id
//        return person
//    }
//
//}