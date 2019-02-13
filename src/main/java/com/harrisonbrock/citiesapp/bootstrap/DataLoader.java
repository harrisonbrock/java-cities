package com.harrisonbrock.citiesapp.bootstrap;

import com.harrisonbrock.citiesapp.domain.City;
import com.harrisonbrock.citiesapp.services.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final CityService cityService;

    public DataLoader(CityService cityService) {
        this.cityService = cityService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    public void loadData() {

        cityService.save(new City("Akron, Ohio", 135000, 3));
        cityService.save(new City("Albany, N.Y.", 182000, 8));
        cityService.save(new City("Albuquerque, N.M.", 167000, 7));
        cityService.save(new City("Allentown, Pa.", 175000, 5));
        cityService.save(new City("Atlanta, Ga.", 210000, 4));
        cityService.save(new City("Augusta, Ga.", 155000, 1));
        cityService.save(new City("Austin, Texas", 290000, 9));
        cityService.save(new City("Bakersfield, Calif.", 215000, 7));
        cityService.save(new City("Baltimore, Md.", 248000, 5));
        cityService.save(new City("Baton Rouge, La.", 168000, 3));
        cityService.save(new City("Birmingham, Ala.", 153000, 1));
        cityService.save(new City("Boise, Idaho", 260000, 8));
        cityService.save(new City("Boston, Mass.", 410000, 9));
        cityService.save(new City("Bridgeport, Conn.", 356000, 7));
        cityService.save(new City("Buffalo, N.Y.", 141000, 5));
        cityService.save(new City("Cape Coral, Fla.", 209000, 8));
        cityService.save(new City("Charleston, S.C.", 239000, 8));
        cityService.save(new City("Charlotte, N.C.", 204000, 4));
        cityService.save(new City("Chattanooga, Tenn.", 158000, 4));
        cityService.save(new City("Chicago, Ill.", 215000, 4));
        cityService.save(new City("Cincinnati, Ohio", 158000, 2));
        cityService.save(new City("Cleveland, Ohio", 128000, 1));
        cityService.save(new City("Colorado Springs, Colo.", 280000, 8));
        cityService.save(new City("Columbia, S.C.", 139000, 2));
        cityService.save(new City("Columbus, Ohio", 180000, 4));
        cityService.save(new City("Dallas, Texas", 195000, 5));
        cityService.save(new City("Dayton, Ohio", 120000, 2));
        cityService.save(new City("Deltona, Fla.", 191000, 7));
        cityService.save(new City("Denver, Colo.", 383000, 9));
        cityService.save(new City("Des Moines, Iowa", 173000, 3));
        cityService.save(new City("Detroit, Mich.", 157000, 1));
        cityService.save(new City("Durham, N.C.", 220000, 3));
        cityService.save(new City("El Paso, Texas", 124000, 6));
        cityService.save(new City("Fayetteville, Ark.", 180000, 2));
        cityService.save(new City("Fresno, Calif.", 250000, 9));
        cityService.save(new City("Grand Rapids, Mich.", 182000, 5));
        cityService.save(new City("Greensboro, N.C.", 140000, 3));
        cityService.save(new City("Greenville, S.C.", 170000, 5));
        cityService.save(new City("Harrisburg, Pa.", 163000, 3));
        cityService.save(new City("Hartford, Conn.", 209000, 5));
        cityService.save(new City("Honolulu, Hi.", 600000, 10));
        cityService.save(new City("Houston, Texas", 178000, 4));
        cityService.save(new City("Indianapolis, Ind.", 125000, 2));
        cityService.save(new City("Jacksonville, Fla.", 195000, 3));
        cityService.save(new City("Kansas City, Mo.", 143000, 3));
        cityService.save(new City("Knoxville, Tenn.", 162000, 4));
        cityService.save(new City("Lakeland, Fla.", 165000, 6));
        cityService.save(new City("Lancaster, Pa.", 190000, 7));
        cityService.save(new City("Las Vegas, Nev.", 266000, 8));
        cityService.save(new City("Little Rock, Ark.", 145000, 2));
        cityService.save(new City("Los Angeles, Calif.", 634000, 10));
        cityService.save(new City("Louisville, Ky.", 168000, 3));
        cityService.save(new City("Madison, Wis.", 250000, 7));
        cityService.save(new City("Memphis, Tenn.", 142000, 1));
        cityService.save(new City("Miami, Fla.", 255000, 8));
        cityService.save(new City("Milwaukee, Wis.", 179000, 2));
        cityService.save(new City("Minneapolis-St. Paul, Minn.", 252000, 5));
        cityService.save(new City("Modesto, CA", 295000, 9));
        cityService.save(new City("Nashville, Tenn.", 247000, 6));
        cityService.save(new City("New Haven, Conn.", 194000, 6));
        cityService.save(new City("New Orleans, La.", 184000, 4));
        cityService.save(new City("New York, N.Y.-N.J.", 410000, 10));
        cityService.save(new City("North Port-Sarasota, Fla.", 234000, 8));
        cityService.save(new City("Ogden, Utah", 214000, 10));
        cityService.save(new City("Oklahoma City, Okla.", 148000, 1));
        cityService.save(new City("Omaha, Neb.", 180000, 6));
        cityService.save(new City("Orlando, Fla.", 220000, 7));
        cityService.save(new City("Oxnard, Calif.", 589000, 10));
        cityService.save(new City("Palm Bay, Fla.", 185000, 5));
        cityService.save(new City("Philadelphia, Pa.", 205000, 1));
        cityService.save(new City("Phoenix, Ariz.", 252000, 7));
        cityService.save(new City("Pittsburgh, Pa.", 138000, 2));
        cityService.save(new City("Portland, Ore.", 370000, 9));
        cityService.save(new City("Providence, R.I.", 262000, 6));
        cityService.save(new City("Raleigh, N.C.", 246000, 6));
        cityService.save(new City("Richmond, Va.", 226000, 8));
        cityService.save(new City("Riverside-San Bernardino, Calif.", 339000, 10));
        cityService.save(new City("Rochester, N.Y.", 137000, 4));
        cityService.save(new City("Sacramento, Calif.", 375000, 8));
        cityService.save(new City("Salt Lake City, Utah", 255000, 9));
        cityService.save(new City("San Antonio, Texas", 153000, 6));
        cityService.save(new City("San Diego, Calif.", 545000, 10));
        cityService.save(new City("San Francisco, Calif.", 860000, 10));
        cityService.save(new City("San Jose, Calif.", 1100000, 10));
        cityService.save(new City("Scranton-Wilkes-Barre, Pa.", 100000, 2));
        cityService.save(new City("Seattle, Wash.", 430000, 9));
        cityService.save(new City("Spokane, Wash.", 228000, 7));
        cityService.save(new City("Springfield, Mass.", 200000, 6));
        cityService.save(new City("St. Louis, Mo.", 157000, 4));
        cityService.save(new City("Stockton, Calif.", 335000, 10));
        cityService.save(new City("Syracuse, N.Y.", 112000, 1));
        cityService.save(new City("Tampa, Fla.", 189000, 5));
        cityService.save(new City("Toledo, Ohio", 109000, 1));
        cityService.save(new City("Tucson, Ariz.", 198000, 6));
        cityService.save(new City("Tulsa, Okla.", 146000, 3));
        cityService.save(new City("Virginia Beach, Va.", 217000, 9));
        cityService.save(new City("Washington, D.C.-No. Va.", 375000, 9));
        cityService.save(new City("Winston-Salem, N.C.", 144000, 2));
        cityService.save(new City("Worcester, Mass.", 241000, 7));
        cityService.save(new City("Youngstown, Ohio", 77000, 1));

    }
}
