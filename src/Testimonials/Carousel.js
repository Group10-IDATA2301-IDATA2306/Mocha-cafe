import "./Carousel.css"

/**
 * Creates a Carousel component
 * @constructor
 * @returns {JSX.Element}
 */
export function Carousel() {
  return (
    <container id="Testimonials">
      <h2>What our customers say</h2>
      <carousel>
        <item id="sean-card">
        <container class="rating">
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
        </container>
          <p>Mocha Nooka Cafe is my favorite spot for a chill, hip atmosphere. The coffee is 
                always on point and the staff are super helpful. A definite must-visit for anyone who's looking 
                for a unique cafe experience!</p>
          <container class="portrait-container">
            <portrait id="Sean"></portrait>
            <h3>Sean</h3>
          </container>
        </item>

        <item>
        <container class="rating">
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
        </container>
      
        <p>This coffe cured my depression. I am a changed man and i am ready to take on the world again!</p>
        <container class="portrait-container">
            <portrait id="Toni"></portrait>
            <h3>Toni</h3>
          </container>
        </item>

        <item>

        <container class="rating">
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
          <i class="fa fa-star fa-5x" aria-hidden="true"></i>
        </container>

        <p>I love coming to Mocha Nooka Cafe! It's the perfect spot to hang out with friends and 
             enjoy something tasty and refreshing. The atmosphere is always chill and the staff are really 
             friendly. Highly recommended!</p>
        <container class="portrait-container">
            <portrait id="Sarah"></portrait>
            <h3>Sarah</h3>
        </container>
    
        </item>

      </carousel>
    </container>
  )
}


 // The items in the carousel
    //    const carouselItems = [
    //     {
    //         "name": "Sean",
    //         "comment": `Mocha Nooka Cafe is my favorite spot for a chill, hip atmosphere. The coffee is 
    //         always on point and the staff are super helpful. A definite must-visit for anyone who's looking 
    //         for a unique cafe experience!`,
    //         "rating": 5
    //     },
    //     {
    //         "name": "John",
    //         "comment": `I've been coming to Mocha Nooka Cafe for years and it's never disappointed. The 
    //         coffee is always freshly brewed and the food is always delicious. It's a great spot for a quick 
    //         break, or a leisurely chat with friends.`,
    //         "rating": 4
    //     },
    //     {
    //         "name": "Sarah",
    //         "comment": `I love coming to Mocha Nooka Cafe! It's the perfect spot to hang out with friends and 
    //         enjoy something tasty and refreshing. The atmosphere is always chill and the staff are really 
    //         friendly. Highly recommended!`
    //         ,
    //         "rating": 4
    //     },
    //     {
    //         "name": "Toni",
    //         "comment": "This coffe cured my depression. My life has never been better.",
    //         "rating": 5
    //     }
    // ];






    // const medianIndex = Math.round(carouselItems.length / 2);

    // // The index of the current carousel item in focus
    // var currentIndex = medianIndex;

    // var leftItem = carouselItems.at((currentIndex - 1) % (carouselItems.length - 1));
    // var middleItem = carouselItems.at(currentIndex);
    // var rightItem = carouselItems.at((currentIndex + 1) % (carouselItems.length - 1));


    // function initialize(){

    //     setCarouselIndex(medianIndex);
        
    //     // Initial 
    //     for (let index = 0; index < carouselItems.length; index++) {
    //         carouselMap.set(carouselItems.at(index), (currentIndex + index) % (carouselItems.length - 1))
    //     }

    // }

    // React variables

    // // Keeps track of where the user is in the carousel and sets the default posistion to the item in the middle
    // const [carouselIndex,setCarouselIndex] = useState(0);


    // // The idea is to have a css class for each index, which gives the element an animation.
    // function rotateLeft(){
    //     setCarouselIndex(carouselIndex--);
    // }

    // function rotateRight(){
    //     setCarouselIndex(carouselIndex++);
    // }



