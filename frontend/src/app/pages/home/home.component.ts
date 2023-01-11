import { Component } from '@angular/core';
import { NgxSpinnerService } from "ngx-spinner";
import { JavaAiResponse } from 'src/app/common/java-ai-response';
import { JavaAiService } from 'src/app/services/java-ai.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  apiResponseImageOrText: JavaAiResponse | undefined;

  constructor(private aiService: JavaAiService,
    private spinner: NgxSpinnerService) {
    this.getNewAiResponse();
  }



  getNewAiResponse() {
    this.aiService.requestDataFromAi().subscribe({
      next: (data: JavaAiResponse) => {
        this.apiResponseImageOrText = data;
      },
      error: (err: any) => console.log(err)
    })
  }

  getImage(imgUrl: string) {
    if (!imgUrl) return '';

    return imgUrl;
  }

}
