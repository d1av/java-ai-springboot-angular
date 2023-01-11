import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AiButtonCallComponent } from './ai-button-call/ai-button-call.component';
import { AiStatusImageComponent } from './ai-status-image/ai-status-image.component';
import { DescriptionComponent } from './layout/description/description.component';
import { FooterComponent } from './layout/footer/footer.component';
import { QuoteComponent } from './main-content/quote/quote.component';



@NgModule({
  declarations: [
    AiStatusImageComponent,
    AiButtonCallComponent,
    DescriptionComponent,
    FooterComponent,
    QuoteComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AiStatusImageComponent,
    AiButtonCallComponent,
    DescriptionComponent,
    FooterComponent,
    QuoteComponent
  ]
})
export class ComponentsModule { }
