import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { AppComponent } from './app.component';
import { TablePrimengComponent } from './table-primeng/table-primeng.component';
import {TableModule} from 'primeng/table';
import { TableCheckboxComponent } from './table-checkbox/table-checkbox.component';
import { tableCheckboxService } from './table-checkbox/table-checkbox.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    TablePrimengComponent,
    TableCheckboxComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    TableModule
  ],
  providers: [tableCheckboxService],
  bootstrap: [AppComponent]
})
export class AppModule { }
