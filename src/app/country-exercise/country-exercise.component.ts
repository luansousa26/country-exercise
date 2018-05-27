import { Component, OnInit } from '@angular/core';
import { CitiesModel } from './models/cities-model';
import { CountryModel } from './models/country-model';
import { CountryExerciseService } from './country-exercise.service';

@Component({
  selector: 'app-country-exercise',
  templateUrl: './country-exercise.component.html',
  styleUrls: ['./country-exercise.component.css']
})
export class CountryExerciseComponent implements OnInit {

  constructor(private countryExerciseService: CountryExerciseService) { }

  ngOnInit() {

    /* when the Page init two methods are called
    to populate the arrays availableCities and avaliableCountry.
    */
    this.getAllCities();
    this.getAllCountries();
  }

  // Used to armazen the Cities.
  availableCities: any[] = [];

  // Used to find each actual City By Index 0 1 2 3 ..
  actualCity: number;

  // Used to armazen the coutries.
  avaliableCountries: any[] = [];

  // Used to armazen and show to user a Json.
  viewJson: any;

  /* Method that calls the service REST and get the cities
  when recives the cities the method atributes the value to ViewJson.
  */
  getAllCities() {
    this.countryExerciseService.getAllCities().subscribe((cities) => {
      this.availableCities = cities['location'];
      this.viewJson = this.availableCities;
    });
  }

  /*
  Method that calls the service Rest and get the Contries.
  */
  getAllCountries() {
    this.countryExerciseService.getAllCountries().subscribe((countries) => {
      this.avaliableCountries = countries['location'];
    });
  }

  /*
  Method that listen the Event drop from the user and get the country and city index
  and add in country the city droped by user , and in the end add in Json in position the county ID in parent.
  */
  droped($event: any, country) {
  
    this.avaliableCountries[country.index].availableCities = [$event.dragData[this.actualCity].LocalName];
    this.viewJson[this.actualCity].ChildOf[0].Parent = country.ID;
  }

  /*
  Method that listen the event of drag happens and get the city index.
  */
  dragStart($event, cities) {
    this.actualCity = cities.index;
  }

  /*
   Method that Remove city from Country and JSON parent.
  */
  removeCity(country) {
    this.avaliableCountries[country.index].availableCities = undefined;
    this.viewJson[this.actualCity].ChildOf[0].Parent = '';
    this.viewJson[this.actualCity].ChildOf[0].ProposedBy = '';
    this.viewJson[this.actualCity].ChildOf[0].Status = '';
    this.viewJson[this.actualCity].ChildOf[0].Action = '';
  }

}
