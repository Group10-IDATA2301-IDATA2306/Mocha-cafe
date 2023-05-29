import { createSlice } from "@reduxjs/toolkit";
import { productLoadMore } from "../../api/HttpInterface";

export const productsSlice = createSlice({
  name: "articles",
  initialState: {
    homeSort: {
      sortby: "_id",
      order: "desc",
      limit: 4,
      skip: 0,
    },
    loading: false,
    articles: [],
    current: null,
    categories: [],
  },
  reducers: {
    updateCategories: (state, action) => {
      state.categories = action.payload;
    },
  },
  extraReducers: (builder) => {
    builder
      // HOME LOAD MORE
      .addCase(productLoadMore.fulfilled, (state, action) => {
        state.homeSort.skip = action.payload.sort.skip;
        state.articles = action.payload.newState;
      });
  },
});

export const { updateCategories } = productsSlice.actions;
export default productsSlice.reducer;
