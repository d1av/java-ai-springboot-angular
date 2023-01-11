import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AiStatusImageComponent } from './ai-status-image/ai-status-image.component';
import { HomeComponent } from '../pages/home/home.component';
import { AiButtonCallComponent } from './ai-button-call/ai-button-call.component';



@NgModule({
  declarations: [
    AiStatusImageComponent,
    AiButtonCallComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AiStatusImageComponent,
    AiButtonCallComponent
  ]
})
export class ComponentsModule { }