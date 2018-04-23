import {
  Injectable
} from '@angular/core';
import {
  Http,
  Response
} from '@angular/http';
import 'rxjs/add/operator/map';
import {
  HttpClient,
  HttpResponse
} from '@angular/common/http';
import {
  Observable
} from 'rxjs/Observable';


@Injectable()
export class CountryExerciseService {

  constructor(private http: HttpClient) { }

  // Here we have tow URIS that hit in the REST EndPoint Mock.
  private urlCitys = 'https://demo4677424.mockable.io/getCitys';
  private urlCountrys = 'https://demo4677424.mockable.io/getCountrys';

  // Method for get All cities and return.
  getAllCities() {
    return this.http.get(`${this.urlCitys}`);
  }
  
  // Method for get All countries and return.
  getAllCountries() {
    return this.http.get(`${this.urlCountrys}`);
  }

}
