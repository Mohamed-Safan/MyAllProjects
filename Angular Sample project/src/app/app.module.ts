import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import {MatButtonModule} from '@angular/material/button';
import { GuiComponent } from './gui/gui.component';
import {MatIconModule} from '@angular/material/icon';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import { PtsComponent } from './pts/pts.component';
import { GoalscoredComponent } from './goalscored/goalscored.component';
import { WinsComponent } from './wins/wins.component';
import {MatTableModule} from '@angular/material/table';
import {MatFormFieldModule} from '@angular/material/form-field';
import { SearchComponent } from './search/search.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

const routes: Routes = [{
  path:"gui",component:GuiComponent
},

  {
    path:"pts",component:PtsComponent
  },

  {
    path:"goalscored",component:GoalscoredComponent
  },

  {
    path:"wins",component:WinsComponent
  },

  {
    path:"search",component:SearchComponent

  }



];



@NgModule({
  declarations: [
    AppComponent,
    GuiComponent,
    PtsComponent,
    GoalscoredComponent,
    WinsComponent,
    SearchComponent
  ],


  imports: [
    BrowserModule,
    AppRoutingModule,RouterModule.forRoot(routes),
    MatButtonModule,
    MatIconModule,
    MatSidenavModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatTableModule,
    BrowserAnimationsModule



  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
